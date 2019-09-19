package designPatterns;

public class Singleton05 {
	/*
	 * 饿汉式单例
	 * 在类初始化时，已经自行实例化
	 * 饿汉式天生就是线程安全的
	 * */
  private static final Singleton05 singleton = new Singleton05();

  private Singleton05 () {}

	public static Singleton05 getInstance() {
		return singleton;
	}
	
}
