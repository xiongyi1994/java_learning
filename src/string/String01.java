package string;

public class String01 {

	public static void main(String[] args) {
		String aString = "xiongyi";
		String bString = "xi" + new String("ongyi");
		System.out.println(aString == bString);
	}
	
}
