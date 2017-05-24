package objectClass;

import java.util.HashSet;

class Point{
	private final int x;
	private final int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	// 错误的覆写示例
	/*public boolean equals(Point other){
		return (this.getX() == other.getX() && this.getY() == other.getY());
	}*/
	
	// 更好但不完美的equals方法
	public boolean equals(Object other){
		boolean result = false;
		if(other instanceof Point){
			Point that = (Point) other; // 对象的向下转型
			result = (this.getX() == that.getX() && this.getY() == that.getY());
		}
		return result;
	}
}

public class EqualsDemo01 {
	/*
	 * equals()方法重载时，四个会引发equals行为不一致的常见陷阱
	 * 1、定义了错误的equals()方法签名(signature)
	 * */
	public static void main(String[] args) {
		Point aPoint = new Point(1, 2);
		Point bPoint = new Point(1, 2);
		System.out.println(aPoint.equals(bPoint));
		
		//一旦把这个Point类的实例放入到一个容器中问题就出现了
		HashSet<Point> coll = new HashSet<Point>();
		coll.add(aPoint);
		System.out.println(coll.contains(bPoint));
		
		System.out.println(aPoint.hashCode() == bPoint.hashCode());
		
		Object bObject2 = bPoint;
		System.out.println(aPoint.equals(bObject2));
	}
}
