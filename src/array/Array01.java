package array;

public class Array01 {
	public static void main(String[] args) {
		// Java 中的array 分为动态初始化 和 静态初始化
		
		// 动态初试化
		int intArray[] = null; // null 为 引用数据类型 的 默认值
		intArray = new int[3];
		System.out.println(intArray[0]);
		
		// 静态初始化
		int intArray2[] = {1,2,3};
		
		int a[] = fun();
		System.out.println(a.length);
	}
	
	public static int[] fun(){
		return new int[5];
	}
}
