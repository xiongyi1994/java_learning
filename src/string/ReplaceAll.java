package string;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String string = "xiongyixiongyi";
		
		/*
		 * replaceAll(String regex,string2 replacement)
		 * regex 被替换的字符串 replacement 要替换的字符串
		 * 这个替换是全局的，返回一个字符串
		 * */
		String newString1 = string.replaceAll("xi","");
		System.out.println(newString1);
		
	}
	
}
