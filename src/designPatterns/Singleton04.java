package designPatterns;

public class Singleton04 {
	
	/*
	 * 懒汉式单例
	 * 线程安全 静态内部类
	 * 既实现了线程安全，又避免了同步带来的性能影响
	 * */
	public static void main(String[] args) {
		int threadNum = 1000;
		for (int i = 0; i < threadNum; i++) {
			new Thread() {
				public void run() {
					System.out.println(Singleton04.getInstance());
				};
			}.start();
		}
	}
	
	private static class LazyHolder {
		private static final Singleton04 INSTANCE = new Singleton04();
	}
	private Singleton04() {};
	public static Singleton04 getInstance() {
		return LazyHolder.INSTANCE;
	}
}
