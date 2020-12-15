package classloader;

/**
 * 类加载过程大致分为：加载、链接、初始化。
 * 链接 可以细分为：验证、准备、解析。
 *
 * 加载：将字节码从不同的数据源转化为二进制字节流加载到内存中，并生成一个代表该类的Class对象
 *
 * 验证：对二进制字节流进行校验
 *
 * 准备：对类变量分配内存并初始化
 *
 * 解析：将常量池中的符号引用转化为直接引用
 *
 * 初始化：对类变量初始化
 *
 * BootstrapClassLoader 启动类类加载器 (C++实现的)
 * 加载jre/lib下面的jar文件
 *
 * ExtClassLoader 拓展类类加载器
 * 加载jre/lib/ext包下面的jar文件
 *
 * AppClassLoader 应用程序类类加载器
 * 根据程序的类路径classpath来加载Java类
 *
 * ThreadContextClassLoader 线程上下文加载器
 * **/
public class ClassLoader01 {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader01.class.getClassLoader();

        while (classLoader != null) {
            System.out.println(classLoader.toString());
            classLoader = classLoader.getParent();
        }
    }
}
