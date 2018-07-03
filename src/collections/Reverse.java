package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Reverse {
	/*
	 * reverse()方法
	 * 反转集合中的元素
	 * */
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		Collections.addAll(all, "xiongyi","zhangman");
		Iterator<String> iterator = all.iterator();
		
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "、");
		}
		
		System.out.println();
		
		Collections.reverse(all); // 反转
		Iterator<String> iterator02 = all.iterator();
		while(iterator02.hasNext()){
			System.out.print(iterator02.next() + "、");
		}
	}
}
