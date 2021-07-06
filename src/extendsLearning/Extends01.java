package extendsLearning;

class C {

    public C() {
        System.out.println("C 构造");
    }

}

class A extends C {

    // 静态成员
    static int A_a = 0;

    // 私有成员
    private int A_b = 0;

    // 公有成员
    public int A_c = 0;

    // 保护成员
    protected int A_d = 0;

    int A_e = 0;

    static {
        System.out.println("父类静态代码1");
        System.out.println("父类 A_a " + A_a);
    }

    // 构造方法
    public A() {
        System.out.println("父类构造方法1");
    }

    public A(int A_c) {
        this.A_c = A_c;
        System.out.println("父类构造方法2");
    }
}

class B extends A {

    static {
        System.out.println("子类静态代码1");
        A_a = 2;
        System.out.println("子类 A_a " + A_a);
    }

    public B() {
        super();
        System.out.println("子类构造方法1");
    }

    public B(int A_c) {
        this.A_c = A_c;
        System.out.println("子类构造方法2");
    }
}

public class Extends01 {
    public static void main(String[] args) {
        B b = new B();
//        B b1 = new B(1);
    }
}
