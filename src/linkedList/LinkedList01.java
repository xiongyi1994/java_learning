package linkedList;

import java.util.LinkedList;

public class LinkedList01 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.println("初始化链表：" + linkedList);
		
		linkedList.addFirst("X");
		linkedList.addLast("Y");
		System.out.println(linkedList);
		
		System.out.println(linkedList.element()); // 找到表头
		
		System.out.println(linkedList.peek()); // 找到表头，不删除
		
		System.out.println(linkedList.poll()); // 找到表头并删除
		System.out.println(linkedList);
	}
}
