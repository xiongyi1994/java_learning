package objectClass;

public class Equals01 {
	/*
	 * equals()方法是Object类中的公有方法
	 * 判断是不是引用的两个同样的对象
	 * 一般自己写一个类时都要覆写equals()方法，同时也需要覆写hashCode()方法
	 * */
	public static void main(String[] args) {
		Object aObject = new Object();
		Object bObject = new Object();
		System.out.println(aObject == bObject);
		System.out.println(aObject.equals(bObject));
	}
}
