package hashSet;

import java.util.HashSet;

public class HashSet01 {
	/*
	 * HashSet 是 Set 接口的一个子类，主要的特点是：里面不能存放重复元素，而且采用散列的存储方式，所以没有顺序
	 * */
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		Object object[] = new Object[10];
		object = hashSet.toArray();
		for (int i = 0; i < object.length; i++) {
			System.out.println(object[i]);
		}
	}
}
