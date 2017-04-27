package ali_interview;

public class TestFinally {
	public static void main(String[] args)throws InterruptedException {
		Runnable s = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					System.out.println("线程开始执行");
						Thread.sleep(1000);
						System.out.println("线程执行完毕");
				}catch(InterruptedException e){
					System.out.println("睡眠中发生中断");
				}finally{
					System.out.println("finally块被调用了");
				}
			}
		};
		
		Thread thread = new Thread(s);
		
		thread.setDaemon(true);
		
		thread.start();
		Thread.sleep(500);
	}
}
