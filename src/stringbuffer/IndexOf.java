package stringbuffer;

public class IndexOf {

	public static void main(String[] args) {
		
		/*
		 * indexOf()方法返回特定字符串在StringBuffer对象中的索引
		 * 如果没有则返回-1
		 * 只会返回一个匹配成功的索引
		 * */
		
		StringBuffer stringBuffer = new StringBuffer("xiongyixiongyi");
		
		/*
		 * indexOf(String str)
		 * */
		Integer integer = stringBuffer.indexOf("ioi");
		System.out.println(integer);
		
		/*
		 * indexOf(String str,int fromIndex)
		 * 从某个特定的索引开始匹配
		 * */
		
	}
	
}
