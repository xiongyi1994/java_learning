package objectClass;

import java.util.HashSet;

class PointDemo02{
	private final int x;
	private final int y;
	
	public PointDemo02(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public boolean equals(Object other){
		boolean result = false;
		if(other instanceof PointDemo02){
			PointDemo02 that = (PointDemo02) other; // 对象的向下转型
			result = (this.getX() == that.getX() && this.getY() == that.getY());
		}
		return result;
	}
	
	public int hashCode(){
		return(41 * (41 + getX()) + getY()); // 性价比相对较高的做法
	}
}

public class EqualsDemo02 {
	/*
	 * equals()方法重载时，四个会引发equals行为不一致的常见陷阱
	 * 2、重载了equals的但没有同时重载hashCode的方法
	 * */
	public static void main(String[] args) {
		PointDemo02 a = new PointDemo02(1, 2);
		PointDemo02 b = new PointDemo02(1, 2);
		
		HashSet<PointDemo02> hashSet = new HashSet<PointDemo02>();
		hashSet.add(a);
		
		System.out.println(hashSet.contains(b));
	}
}
