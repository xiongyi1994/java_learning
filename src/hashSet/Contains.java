package hashSet;

import java.util.HashSet;

public class Contains {
	/*
	 * contains()方法
	 * */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		String aString =new String("xiongyi");
		String bString =new String("xiongyi");
		
		hashSet.add(aString);
		//hashSet.add(bString);
		
		System.out.println(hashSet);
		System.out.println(hashSet.contains(bString));
	}
}
