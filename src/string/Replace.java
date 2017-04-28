package string;

public class Replace {

	public static void main(String[] args) {
		String string = "xiongyi";
		
		/*
		 * replce(char oldChar,char newChar)
		 * 把原来string里面的某个字符替换为所给的新字符
		 * 这个替换对于这个string来说是全局的
		 * 返回一个新的string
		 * */
		String newString1 =  string.replace('i', 'x');
		System.out.println(newString1);
	}
	
}
