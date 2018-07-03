package treeMap;

import java.util.HashMap;
import java.util.Map;

public class EntrySet {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("xiongyi", 23);
		hashMap.put("zhangman", 22);
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
			System.out.println(entry);
			System.out.println(entry.getKey());
		}
	}
}
