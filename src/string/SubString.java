package string;

public class SubString {

	public static void main(String[] args) {
		
		String string = "xiongyi";
		
		// substring(int beginIndex)
		// 从字符串的某个索引开始截取子串
		String subString1 = string.substring(1);
		System.out.println(subString1);
		
		// substring(int beginIndex,int endIndex)
		// 以字符串的开始索引和结束索引来截取子串
		String subString2 = string.substring(1, string.length()-1);
		System.out.println(subString2);
	}
	
}
