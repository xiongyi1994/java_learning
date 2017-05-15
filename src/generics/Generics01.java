package generics;

/*
 * 声明泛型
 * */
class Point<T>{
	private T var;
	public T getVar() {
		return var;
	}
	public void setVar(T var){
		this.var = var;
	}
}

public class Generics01 {
	/*
	 * 泛型可以解决数据类型的安全性问题
	 * */
	public static void main(String[] args) {
		Point<Integer> point = new Point<Integer>();
		
		point.setVar(30);
		System.out.println(point.getVar() * 2);
	}
}
