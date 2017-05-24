package objectClass;

public class HashCode {
	public static void main(String[] args) {
		System.out.println(new Object().hashCode());
		
		String aString = "abc";
		String bString = "abc";
		System.out.println(aString == bString);
		System.out.println(aString.hashCode() == bString.hashCode());
	}
}
