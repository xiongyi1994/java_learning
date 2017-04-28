package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ToString {
	
	/*
	 * toString()方法可以将一个 ArrayList 转换为一个 String
	 * 但是开头和结尾有[]
	 * */
	
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("xiong");
		
		arrayList.add("yi");
		
		String aString =  arrayList.toString();
		
		System.out.println(aString);
		
		aString = aString.substring(1);
		
		aString = aString.substring(0,aString.length()-1);
		
		System.out.println(aString);
	}
	
}
