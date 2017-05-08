package wrapperClass;

public class WrapperClass01 {
	public static void main(String[] args) {
		int a = Integer.parseInt("1000");
		System.out.println(a);
		
		int b = 1;
		Integer integer = new Integer(b); // 装箱
		int temp = integer.intValue(); // 拆箱
		System.out.println(temp);
	}
}
