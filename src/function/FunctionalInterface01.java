package function;

/**
 * 函数式接口里只允许有一个抽象方法
 * 函数式接口里允许定义默认方法
 * 函数式接口里允许定义静态方法
 * 函数式接口里允许定义java.lang.Object里的public方法
 * **/

public class FunctionalInterface01 {

    @FunctionalInterface
    interface A {
        void a(String a);
    }

    public static void main(String... args) {
        A a = a1 -> System.out.println("hello " + a1);

        a.a("xiongyi");
    }

}
