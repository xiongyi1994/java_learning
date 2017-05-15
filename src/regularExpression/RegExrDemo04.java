package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExrDemo04 {
	/*
	 * 将全部的数字替换成 _
	 * */
	public static void main(String[] args) {
		String string = "xiongyi123zhangman";
		String patternString = "\\d+";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(string);
		String newString = matcher.replaceAll("_");
		System.out.println(newString);
	}
}
