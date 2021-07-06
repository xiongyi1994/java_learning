package extendsLearning;

public class Extends4Constructor {

    static class A {
        A() {
            System.out.println("A");
        }

        A(String a) {
            System.out.println("A a");
        }
    }

    static class B extends A {
        B() {
            System.out.println("B");
        }
    }

    static class C extends B {
        C() {
            System.out.println("C");
        }

        C(String c) {
            System.out.println("C c");
        }
    }

    public static void main(String[] args) {
//        new C();
        new C("c");
    }

}
