package abstractClass;

abstract class A {
	public abstract void print();
	public A(){
		// 可以有构造方法
	}
}

class B extends A {
	public B(){
		
	}
	public void print(){
		System.out.println("Hello World!");
	}
}

public class AbstractClass01 {

	/*
	 * 通过对象的多态性为抽象类进行实例化，再使用这个抽象类的对象时就可以调用子类中所覆写过的方法
	 * 当一个实体类集成一个抽象类，必须实现抽象类中的所有抽象方法
	 * */
	
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
	
}
