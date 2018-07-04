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
			single = new Singleton01(); // 在第一次调用的时候实例化自己
		}
		return single;
	}
	
	public static void main(String[] args) {
		int threadNum = 100;
		for (int i = 0; i < threadNum; i++) {
			new Thread() {
				public void run() {
					System.out.println(Singleton01.getInstance()); // 多线程的情况下可能会出现多个Singleton实例
				};
			}.start();
		}
	}
}
