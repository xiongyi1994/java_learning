package designPatterns;

public class Singleton03 {
	
	/*
	 * 懒汉式单例
	 * 线程安全 双重检查锁定
	 * */
	public static void main(String[] args) {
		int threadNum = 1000;
		for (int i = 0; i < threadNum; i++) {
			new Thread() {
				public void run() {
					System.out.println(Singleton03.getInstance());
				};
			}.start();
		}
	}
	
	private Singleton03() {};
	private static Singleton03 singleton = null;
	
	public static Singleton03 getInstance() {
		if (singleton == null) {
			synchronized (Singleton03.class) {
				if (singleton == null) {
					singleton = new Singleton03();
				}
			}
		}
		return singleton;
	}
}
