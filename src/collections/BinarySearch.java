package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
	/*
	 * binarySearch()方法
	 * 检索集合中的内容，返回内容的位置
	 * */
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "xiongyi","zhangman");
		int point = Collections.binarySearch(all, "zhangman");
		System.out.println(point);
	}
}
