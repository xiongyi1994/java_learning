package string;

public class Equals {

	public static void main(String[] args) {
		
		String aString = new String("123");
		String bString = new String("123");
		
		System.out.println(aString == bString);
		System.out.println(aString.equals(bString));
		
	}
	
}
