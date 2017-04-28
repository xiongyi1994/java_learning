package string;

public class Constructors {

	public static void main(String[] args) {
		
		/*
		 * String()
		 * 初始化一个新创建的字符串对象，以便它表示空字符序列。
		 * */
		String string01 = new String();
		
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
		 * */
		char char01[] = {'1','2','3'};
		System.out.println(char01);
		String string05 = new String(char01);
		System.out.println(string05);
	}
	
}
