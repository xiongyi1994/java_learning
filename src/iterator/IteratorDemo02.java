package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("_");
		all.add("world");
		Iterator<String> iterator = all.iterator();
		
		while(iterator.hasNext()){
			String string = iterator.next();
			if("_".equals(string)){
				iterator.remove();
			}else {
				System.out.print(string + "、");
			}
		}
		System.out.println("\n删除之后的集合；" + all);
	}
}
