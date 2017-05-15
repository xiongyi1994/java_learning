package hashMap;

import java.util.HashMap;

public class HashMap01 {

	/*
	 * HashMap 实现了Map<k,v>接口，允许空的key或者空的value
	 * HashMap 与 HashTable是大致相似的，但是它是非同步的并且是允许空值的
	 * HashMap 是 线程不安全的
	 * */
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("xiongyi", 23);
		hashMap.put("zhangman", 21);
		
		System.out.println(hashMap);
		
	}
	
}
