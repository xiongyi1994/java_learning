package string;

public class AnonymityObject {

	/*
	 * 一个字符串 "aa" 就是有一个String的匿名对象
	 * 如果一个字符串已经被一个名称所引用，则以后再有相同的字符串声明时，就不会再重新开辟空间
	 * */
	
	public static void main(String[] args) {
		
		String aString = "aaa";
		String bString = "aaa";
		
		System.out.println(aString == bString);
		
	}
	
}
