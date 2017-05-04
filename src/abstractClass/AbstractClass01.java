package abstractClass;

abstract class A {
	public abstract void print();
}

class B extends A {
	public void print(){
		System.out.println("Hello World!");
	}
}

public class AbstractClass01 {

	/*
	 * 通过对象的多态性为抽象类进行实例化，再使用这个抽象类的对象时就可以调用子类中所覆写过的方法
	 * */
	
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
	
}
