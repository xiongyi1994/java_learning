package string;

public class Equals {

	public static void main(String[] args) {
		
		/*
		 * 使用这种构造函数是没有必要的，除非字符串是不可变字符串
		 * */
		String aString = new String("123");          
		String bString = new String("123");
		
		System.out.println(aString == bString);  // -> false
		System.out.println(aString.equals(bString));  // -> true
		
		String cString = "1";
		String dString = "1";
		
		System.out.println(cString == dString); // -> true
		System.out.println(cString.equals(dString));  // -> true
		
	}
	
}
