package interfaceLearning;

interface A {
	public abstract void print();

	// 接口不能有构造函数
	/*public A(){
		
	}*/
}

class B implements A {

	public void print() {
		System.out.println("Hello World!");
	}
	
}

public class Interface01 {
	
	/*
	 * 通过对象的多态性为接口进行实例化，再使用这个接口时就可以调用子类中所覆写过的方法
	 * */
	
	public static void main(String[] args) {
		
		A a = new B();
		a.print();
		
	}
	
}
