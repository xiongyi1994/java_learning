package string;

public class Split {

	/*
	 * string.split()方法按照指定的字符串对字符串进行拆分
	 * */
	
	public static void main(String[] args) {
		
		String aString = "xiong yi";
		
		String[] array = aString.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		String bString = "a,b,c,,";
		String[] array_2 = bString.split(",");
		System.out.println(array_2.toString());
		
	}
	
}
