package math;

public class Abs {
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 30));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.abs(Integer.MIN_VALUE+1));// 为什么等于这么多？ 原码，反码，补码
	}
}
