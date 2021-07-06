package interfaceLearning;

interface A {
    public abstract void print();

    // 接口不能有构造函数
	/*public A(){
		
	}*/
}

class B implements A {
    @Override
    public void print() {
        System.out.println("父类B调用print方法");
    }
}

class C extends B {
    @Override
    public void print() {
        System.out.println("子类C调用print方法");
    }
}

public class Interface01 {

    /*
     * 通过对象的多态性为接口进行实例化，再使用这个接口时就可以调用子类中所覆写过的方法
     * */

    public static void main(String[] args) {

        A a = new B();
        a.print();
        A a1 = new C();
        a1.print();

    }

}
