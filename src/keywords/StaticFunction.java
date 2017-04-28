package keywords;

public class StaticFunction {

	/*
	 * static用来声明方法时，方法称为类方法。
	 * 非static声明的方法可以去调用static声明的属性或方法。
	 * static声明的方法是不能调用非static类声明的属性或方法的。
	 * */
	
	int a = 1;
	static int b = 2;
	
	public static void main(String[] args) {
		
		// func1();  报错
		fun2();
		
	}
	
	void fun1(){
		System.out.println("非static方法");
		System.out.println("输出a："+a);
		System.out.println("输出b："+b);
	}
	
	static void fun2(){
		System.out.println("static方法");
		// System.out.println("输出a："+a); 报错
		System.out.println("输出b："+b);
	}
	
}
