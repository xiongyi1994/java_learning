package string;

public class Constructors {

	public static void main(String[] args) {
		
		/*
		 * String()
		 * 初始化一个新创建的字符串对象，以便它表示空字符序列。
		 * */
		String string01 = new String();
		System.out.println(string01);
		
		/*
		 * String(byte[] bytes)
		 * 
		 * */
		
		/*
		 * String(byte[] bytes, Charset charset)
		 * */
		
		/*
		 * String(byte[] ascii, int hibyte)
		 * */
		
		/*
		 * String(char[] value)
		 * 通过字符数组来初始化一个String对象
		 * */
		char char05[] = {'1','2','3'};
		System.out.println(char05);
		String string05 = new String(char05);
		System.out.println(string05);
	}
	
}
