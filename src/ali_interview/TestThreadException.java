package ali_interview;

public class TestThreadException {
	public static void main(String[] args) {
		Runnable s = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					System.out.println("线程开始执行");
						throw new RuntimeException("发生异常");
				}finally{
					System.out.println("finally块被调用了");
				}
			}
		};
		
		Thread thread = new Thread(s);
		
		thread.setDaemon(true);
		
		try{
			thread.start();
		}catch(Exception e){
			System.out.println("捕获到异常");
		}
	}
}
