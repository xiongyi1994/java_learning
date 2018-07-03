package instanceofLearning;

public class InstanceofDemo01 {
	public static void main(String[] args) {
		
		System.out.println("aa" instanceof Object);
		String aString;
		//System.out.println(aString instanceof Object);
		System.out.println(new String("aaa") instanceof Object);
		
		System.out.println("aa" == new String("aa"));
		
		aString = new String("aa");
		System.out.println(aString instanceof Object);
		
	}
}
