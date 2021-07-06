package threadpool_learning;

import java.util.concurrent.Executors;

public class ThreadPoolType {
	
	/*
	 * 1、newFixedThreadPool()
	 * 		初始化一个指定线程数的线程池
	 * 		即使当线程池没有可执行任务时，也不会释放线程
	 * 2、newCachedThreadPool()
	 * 		初始化一个可以缓存的线程池，默认缓存60s
	 * 		没有任务执行时，当线程的空闲时间超过keepAliveTime，会释放线程资源
	 * 3、newSingleThreadExecutor
	 * */
	public static void main(String[] args) {

	}
}
