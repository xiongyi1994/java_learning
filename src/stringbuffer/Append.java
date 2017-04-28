package stringbuffer;

public class Append {

	/*
	 * append() 向一个StringBuffer对象中添加元素
	 * */
	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer();
		
		/*
		 * append(boolean b)
		 * */
		stringBuffer.append(false);
		System.out.println(stringBuffer);
		stringBuffer.delete(0, stringBuffer.length());
		
		/*
		 * append(char c)
		 * */
		stringBuffer.append('1');
		System.out.println(stringBuffer);
		
		/*
		 * append(char[] str)
		 * */
		
		/*
		 * append(char[] str, int offset, int len)
		 * */
		
	}
	
}
