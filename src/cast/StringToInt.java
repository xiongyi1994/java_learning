package cast;

public class StringToInt {
	public static void main(String[] args) {
		
		// Integer.valueOf().intValue()
		int a = Integer.valueOf("123").intValue();
		System.out.println(a);
		
		// Integer.parseInt()
		int b = Integer.parseInt("123");
		System.out.println(b);
		
	}
}
