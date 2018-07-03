package access_modifier;

class A {
    public void medthod() {
        System.out.println("public");
    }

    private void method() {
        System.out.println("private");
    }
}

// 方法的修饰符不同，并不是方法的重载

public class Example01 {
    public static void main(String[] args) {
        A a = new A();
        a.medthod();
    }
}
