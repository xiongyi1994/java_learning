package hashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap01 {
	
	class Person{
		
	}
	
	public static void main(String[] args) {
		String key = "name";
		String value = "xiongyi";
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put(key, value);
		for(Entry<String, String> entry : hashMap.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		key = "sex";
		value = "male";
		System.out.println("================");
		for(Entry<String, String> entry : hashMap.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
