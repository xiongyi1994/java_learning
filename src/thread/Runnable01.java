package thread;

class MyThreadOfRunable implements Runnable{

	private String name;
	public MyThreadOfRunable(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "运行，i = " + i);
		}
	}
	
}

public class Runnable01 {
	
	/*
	 * 通过runnable实现多线程，则意味着类中的属性将被多个线程共享，如果多个线程处理同一个属性可能会造成资源的同步问题
	 * */
	public static void main(String[] args) {
		MyThreadOfRunable m1 = new MyThreadOfRunable("线程A ");
		MyThreadOfRunable m2 = new MyThreadOfRunable("线程B ");
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
	}
}
