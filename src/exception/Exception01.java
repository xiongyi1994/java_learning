package exception;

public class Exception01 {
	public static void main(String[] args) {
		try{
			int a = 1;
			int b = 0;
			int c = Integer.parseInt("aa");
			System.out.println(a/b);
		}catch(NumberFormatException numberFormatException){
			System.out.println("转换异常");
		}catch(ArithmeticException arithmeticException) {
			System.out.println("算术异常");
		}
	}
}
