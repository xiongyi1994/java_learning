package castOfArray;

public class StringArray2IntArray {
	public static void main(String[] args) {
		
		String stringArray[] = {"1","2","3"};
		
		// for循环 Integer.parseInt() 
		int intArray[] = new int[stringArray.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		
		// 
	}
}
