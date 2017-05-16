package reflection;

class X {
	
}

public class Class02 {
	/*
	 * 实例化Class对象
	 * */
	public static void main(String[] args) {
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		try {
			class1 = Class.forName("reflection.X"); // 最常用的形式
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		class2 = new X().getClass(); // 通过Object类中的方法实例
		
		class3 = X.class; // 通过.class实例化
		
		System.out.println("类名称：" + class1.getName());
		System.out.println("类名称：" + class2.getName());
		System.out.println("类名称：" + class3.getName());
		
	}
}
