package regularExpression;

import java.util.regex.Pattern;

public class RegExrDemo03 {
	/*
	 * 按照字符串的数字将字符串拆分
	 * */
	public static void main(String[] args) {
		String string = "xiongyi123zhangman";
		String patternString = "\\d+";
		Pattern pattern = Pattern.compile(patternString);
		String s[] = pattern.split(string);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+"\t");
		}
	}
}
