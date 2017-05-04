package keywords;

class A {
	public void fun1() {
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {
		this.fun1();
	}
};

class B extends A {
	public void fun1() {  // 覆写父类中的方法fun1()
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {
		System.out.println("B --> public void fun3(){}");
	}
}

public class Instanceof01 {
	
	public static void main(String[] args) {
		
		A a1 = new B(); // 通过向上转型实例化A类对象
		System.out.println("A a1 = new B(): " + (a1 instanceof A));
		System.out.println("A a1 = new B(): " + (a1 instanceof B));
		
		A a2 = new A(); // 通过A类的构造实例化本类对象
		System.out.println("A a2 = new A(): " + (a2 instanceof A));
		System.out.println("A a2 = new A(): " + (a2 instanceof B));
		
	}
	
}
