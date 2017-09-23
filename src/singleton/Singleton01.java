package singleton;

class Singleton{
	// 在内部产生本类的实例化对象，将属性封装
	private static final Singleton instance = new Singleton();
	private Singleton(){ // 将构造方法进行封装
	}
	public static Singleton getInstance(){
		return instance;
	}
	public void print(){
		System.out.println("Hello World!");
	}
}

public class Singleton01 {
	
	/*
	 * 单例设计模式
	 * 通过 构造方法私有化 实现
	 * 虽然声明了3个Singleton对象，但是实际上所有的对象都只是用instance引用
	 * 不管在外面如何使用，最终结果也只是有一个实例化对象存在
	 * */
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		s1.print();
		s2.print();
		s3.print();
		
	}
	
}
