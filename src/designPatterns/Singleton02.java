package designPatterns;

public class Singleton02 {
	
	/*
	 * 懒汉式单例
	 * 线程安全 在getInstance()方法上加synchronized
	 * */
	public static void main(String[] args) {
		int threadNum = 1000;
		for (int i = 0; i < threadNum; i++) {
			new Thread() {
				public void run() {
					System.out.println(Singleton02.getInstance());
				};
			}.start();
		}
	}
	
	private Singleton02() {};
	private static Singleton02 singleton = null;
	
	public static synchronized Singleton02 getInstance() {
		if (singleton == null) {
			singleton = new Singleton02();
		}
		return singleton;
	}
	
}
