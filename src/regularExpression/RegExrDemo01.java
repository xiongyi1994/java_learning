package regularExpression;

import java.util.regex.Pattern;

public class RegExrDemo01 {
	/*
	 * 验证一个字符串是不是由数字组成
	 * */
	public static void main(String[] args) {
		String string = "1234567890";
		if(Pattern.compile("[0-9]+").matcher(string).matches()){
			System.out.println("是由数字组成");
		}else{
			System.out.println("不是由数字组成");
		}
	}
}
