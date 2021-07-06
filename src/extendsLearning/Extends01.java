package extendsLearning;

class C {

    public C() {
        System.out.println("C 构造");
    }

}

class A extends C {

    static {
        System.out.println("调用父类A静态代码块");
    }

    // 静态成员
    static int A_a = 0;

    // 私有成员
    private int A_b = 0;

    // 公有成员
    public int A_c = 0;

    // 保护成员
    protected int A_d = 1;

    int A_e = 0;

    static {
        System.out.println("父类静态代码1");
        System.out.println("父类 A_a " + A_a);
    }

    // 构造方法
    public A() {
        System.out.println("父类构造方法1");
    }

    // 父类公有方法
    public void A_a() {
        System.out.println("调用父类公有方法A_a");
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

    static {
        System.out.println("调用子类B静态代码块");
    }

    // 构造方法

    public B() {
        super();
        System.out.println("子类构造方法1");
    }

    public B(int A_c) {
        this.A_c = A_c;
        System.out.println("子类构造方法2");
    }

    int A_d;

    // override 子类可以重写父类公有方法
    @Override
    public void A_a() {
        System.out.println("调用子类公有方法A_a");
    }

    // override 方法的重载
    public void A_a(int i) {

    }
}

public class Extends01 {
    public static void main(String[] args) {
        B b = new B();
//        B b1 = new B(1);
        // 子类继承父类可以 访问 父类的公有成员，如果在同一个包内还可以访问保护成员，默认成员
        System.out.println(b.A_d);
        b.A_a();
    }
}
