package transformation;

/*
 * 父类
 * */
class A{
	public void fun1(){
		System.out.println("A --> public void fun1()");
	}
	public void fun2(){
		this.fun1();
	}
}

/*
 * 子类
 * */
class B extends A{
	public void fun1(){
		System.out.println("B --> public void fun1()");
	}
	public void fun3(){
		System.out.println("B --> public void fun3()");
	}
}

public class UpTransformation {
	
	/*
	 * 对象向上转型
	 * 调用父类中被子类覆写的方法时，调用的是子类中覆写的方法
	 * 
	 * 父类 父类对象 = 子类实例；
	 * 
	 * */
	
	public static void main(String[] args) {
		
		B b = new B();
		A a = b;
		a.fun1();
		
	}
	
}
