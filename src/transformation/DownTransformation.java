package transformation;

/*
 * 父类
 * */
class C{
	public void fun1(){
		System.out.println("C --> public void fun1()");
	}
	public void fun2(){
		this.fun1();
	}
}

/*
 * 子类
 * */
class D extends C{
	public void fun1(){
		System.out.println("D --> public void fun1()");
	}
	public void fun3(){
		System.out.println("D --> public void fun3()");
	}
}


public class DownTransformation {
	
	/*
	 * 对象向下转型
	 * 
	 * 
	 * 子类 子类对象 = (子类)父类实例
	 * */
	
	public static void main(String[] args) {
		C c = new D();			// 发生了向上转型的关系，子类 --> 父类
		D d = (D)c;				// 发生了向下转型关系
		d.fun1();				// 调用方法被覆写的方法
		d.fun2();
		d.fun3();
	}
	
}
