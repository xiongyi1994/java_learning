package thread;

class MyThreadOfRunnable implements Runnable{

	private String name;
	private int a = 0;
	
	// 构造函数
	public MyThreadOfRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "运行，a = " + a);
			a++;
		}
	}
	
}

public class Runnable01 {
	
	/*
	 * 通过runnable实现多线程，则意味着类中的属性将被多个线程共享，如果多个线程处理同一个属性可能会造成资源的同步问题
	 * */
	public static void main(String[] args) {
		MyThreadOfRunnable m1 = new MyThreadOfRunnable("线程A ");
		MyThreadOfRunnable m2 = new MyThreadOfRunnable("线程B ");
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
	}
	
}
