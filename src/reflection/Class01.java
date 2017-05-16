package reflection;

class X1 {
	
}

public class Class01 {
	/*
	 * Class类
	 * 所有类的对象实际上都是Class类的实例
	 * */
	public static void main(String[] args) {
		X1 x = new X1();
		System.out.println(x.getClass().getName());
	}
}
