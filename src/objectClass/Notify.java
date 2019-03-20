package objectClass;

class MyThread{
	
}

public class Notify {
	
	/*
	 * notify()方法：该方法会唤醒因为调用对象的wait()而等待的线程，其实就是对对象锁的唤醒，从而使得wait()的线程可以有机会获取对象锁。
	 * 调用notify()后，并不会立即释放锁，而是继续执行当前代码，直到synchronized中的代码全部执行完毕，才会释放对象锁
	 * 
	 * wait()和notify()必须在synchronized代码块中调用
	 * 
	 * notifyAll()则是唤醒所有等待的线程
	 * 
	 * */
	
	public static void main(String[] args) {
		
	}
}
