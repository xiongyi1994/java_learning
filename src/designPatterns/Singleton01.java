package designPatterns;

public class Singleton01 {
	/*
	 * 懒汉式单例
	 * */
	private Singleton01(){};
	private static Singleton01 single = null;
	
	// 静态工厂方法
	public static Singleton01 getInstance() {
		if (single == null) {
			single = new Singleton01();
		}
		return single;
	}
}
