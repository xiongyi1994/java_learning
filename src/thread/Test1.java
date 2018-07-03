package thread;

import java.util.Vector;

class A extends Thread {
    private String name;

    private static int a;

    A(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        a++;
        System.out.println(this.name + "----" + a);
    }

    public int getA() {
        return a;
    }
}

class B{

    private int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        A threada = new A("A");
        A threadb = new A("B");
        //threada.start();
        //threadb.start();
        System.out.println("-----------");
        Vector<B> v = new Vector<>();
        B o = new B();
        o.setA(5);
        System.out.println("-----------");
        for (int i = 0; i < 10; i++) {
            v.add(o);
        }
        o.setA(10);
        for (B o1: v) {
            System.out.println(o1.getA());
        }
    }
}
