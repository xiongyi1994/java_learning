package objectClass;

public class Wait {
	
	/*
	 * wait方法：释放占有的对象锁，线程进入等待池，释放cpu，其它正在等待的线程即可抢占此锁
	 * 而sleep不同的是，线程调用此方法后，会休眠一段时间，休眠期间，会暂时释放cpu，但不释放对象锁
	 * */
	public static void main(String[] args) {
		
	}
}
