package thread;

class MyThreadOfT implements Runnable {
	
	private int ticket = 5;
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(ticket>0){
				try{
					Thread.sleep(300);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("卖票：ticket = " + ticket--);
			}
		}
	}
}

public class SyncDemo01 {
	
	/*
	 * 多个线程共享变量，会造成资源的同步问题
	 * */ 
	public static void main(String[] args) {
		MyThreadOfT mt = new MyThreadOfT();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
	}
}
