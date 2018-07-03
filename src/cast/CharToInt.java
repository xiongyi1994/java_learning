package cast;

public class CharToInt {
	public static void main(String[] args) {
		char ch = 'x';
		int a = ch;
		System.out.println(a); // => 120 非数值 直接将char类型赋值给int类型 则int类型存储其十进制的ASCII码
		
		char ch2 = '1';
		int b = ch2;
		System.out.println(b); // => 49 
		
		char ch3 = '!';
		int c = ch3;
		System.out.println(c); // => 33 ASCII码
		
	}
}
