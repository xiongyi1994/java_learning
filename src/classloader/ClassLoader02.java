package classloader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 自定义类加载器
 **/
public class ClassLoader02 extends ClassLoader {

    // 用于读取.Class文件的路径
    private String swapPath;

    // 用于标记这些name的类是不是由此类加载器加载
    private Set<String> useClassLoader02;

    public ClassLoader02(String swapPath, Set<String> useClassLoader02) {
        this.swapPath = swapPath;
        this.useClassLoader02 = useClassLoader02;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class<?> c = findLoadedClass(name);
        if (c == null && useClassLoader02.contains(name)) {
            // 特殊的类让此类加载器加载
            c = findClass(name);
            if (c != null) {
                return c;
            }
        }
        return super.loadClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 根据文件系统路径加载class文件，并返回byte数组
        byte[] classBytes = getClassByte(name);
        // 调用ClassLoader提供的方法，将二进制数组转换成class类的实例
        return defineClass(name, classBytes, 0, classBytes.length);
    }

    private byte[] getClassByte(String name) {
        String className = name.substring(name.lastIndexOf('.') + 1) + ".class";

        try {
            FileInputStream fileInputStream = new FileInputStream(swapPath + className);
            byte[] buffer = new byte[1024];

            int length = 0;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while ((length = fileInputStream.read(buffer)) > 0) {
                byteArrayOutputStream.write(buffer, 0, length);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new byte[]{};
    }

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                String swapPath = ClassLoader02.class.getResource("").getPath();
                String className = "classloader.Test";
                Set<String> set = new HashSet<>();
                set.add(className);

                ClassLoader02 classLoader02 = new ClassLoader02(swapPath, set);
                try {
                    Object o = classLoader02.loadClass(className).newInstance();
                    o.getClass().getMethod("printVersion").invoke(o);
                } catch (IllegalAccessException | InstantiationException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2000);
    }
}
