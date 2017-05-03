package string;

public class IndexOf {

	/*
	 * indexOf()方法返回特定字符串在StringBuffer对象中的索引
	 * 如果没有则返回-1
	 * 只会返回一个匹配成功的索引
	 * */
	
	public static void main(String[] args) {
		
		String aString = new String("xiongyixiongyi");
		
		/*
		 * indexOf(String str)
		 * */
		Integer integer = aString.indexOf("x");
		System.out.println(integer);
		
		/*
		 * indexOf(String str,int fromIndex)
		 * 从某个特定的索引开始匹配
		 * */
		
	}
	
}
