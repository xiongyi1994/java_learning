package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ToArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		
		// ArrayList.toArray()
		// 返回一个Object类型的数组
		Object[] array = list.toArray();
		for(Object i : array){
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		// ArrayList.toArray(T[] a);
		// 泛型
		Integer[] a = null;
		a = list.toArray(new Integer[0]);
		for(int i : a){
			System.out.println(i);
		}
	}
}
