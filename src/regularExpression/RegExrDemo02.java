package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExrDemo02 {
	/*
	 * 判断一个字符串是否符合日期的格式：yyyy-mm-dd
	 * */
	public static void main(String[] args) {
		String string = "2017-05-15";
		String patternString = "\\d{4}-\\d{2}-\\d{2}";  //定义验证规则
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(string);
		if(matcher.matches()){
			System.out.println("日期格式合法");
		}else{
			System.out.println("日期格式不合法");
		}
	}
}
