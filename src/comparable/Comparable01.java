package comparable;

public class Comparable01 {
	/*
	 * Arrays.sort()方法可以对Object数组进行排序，但是要使用此种方法排序也是有要求的，即对象所在的类必须实现Comparable接口
	 * Comparable接口就是用于指定对象排序规则的
	 * */
	public static void main(String[] args) {
		Comparable comparable = null;
		comparable = 30;
		System.out.println("内容为："+comparable);
	}
}
