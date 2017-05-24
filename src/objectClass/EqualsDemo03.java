package objectClass;

import java.util.HashSet;
import java.util.Iterator;

class PointDemo03{
	private int x;
	private int y;
	
	public PointDemo03(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public boolean equals(Object other){
		boolean result = false;
		if(other instanceof PointDemo03){
			PointDemo03 that = (PointDemo03) other; // 对象的向下转型
			result = (this.getX() == that.getX() && this.getY() == that.getY());
		}
		return result;
	}
	
	public int hashCode(){
		return(41 * (41 + getX()) + getY()); // 性价比相对较高的做法
	}
}

public class EqualsDemo03 {
	/*
	 * equals()方法重载时，四个会引发equals行为不一致的常见陷阱
	 * 3、建立在会变化字段上的equals定义
	 * */
	public static void main(String[] args) {
		PointDemo03 p = new PointDemo03(1, 2);
		
		HashSet<PointDemo03> hashSet = new HashSet<PointDemo03>();
		
		hashSet.add(p);
		System.out.println(hashSet.contains(p));
		
		p.setX(p.getX() + 1);
		System.out.println(hashSet.contains(p));
		
		Iterator<PointDemo03> it = hashSet.iterator();
		boolean containedP = false;
		while (it.hasNext()) {
			PointDemo03 nextP = it.next();
			if(nextP.equals(p)){
				containedP = true;
				break;
			}
		}
		System.out.println(containedP);
	}
}
