package extendsLearning;

class A {

    // 静态成员
    static int A_a = 0;

    // 私有成员
    private int A_b = 0;

    // 公有成员
    public int A_c = 0;

    // 保护成员
    protected int A_d = 0;

    int A_e = 0;

    // 构造方法
    public A() {
    }

}

class B extends A {
    B() {

    }
}

public class Extends01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.A_d);
    }
}
