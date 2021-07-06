package serializable;

import java.io.*;

/**
 * Java 序列化的三种主要用途
 * 1、作为一种持久化格式
 * 2、作为一种通信数据格式
 * 3、作为一种拷贝、克隆机制
 */

public class SerializableDemo01 {

    private static class Person implements Serializable {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "姓名：" + this.name + "；年龄：" + this.age;
        }
    }

    public static void main(String[] args) throws Exception {
        File file = new File("." + File.separator + "source" + File.separator + "Serializable.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        ObjectOutputStream objectOutputStream = null;
        OutputStream outputStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(new Person("张三", 30));
        objectOutputStream.close();

        ObjectInputStream objectInputStream = null;
        InputStream inputStream = new FileInputStream(file);
        objectInputStream = new ObjectInputStream(inputStream);
        Object object = objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(object);
    }
}
