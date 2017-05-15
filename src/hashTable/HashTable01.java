package hashTable;

import java.util.Hashtable;

public class HashTable01 {

	/*
	 * 实现了Map<K,V>接口，任何 非空 的对象都能作为key或者value
	 * HashTable 是 线程安全的，因为方法中都加了synchronized关键字
	 * */
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> numbers = new Hashtable<>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		
		System.out.println(numbers);
		
	}
	
}
