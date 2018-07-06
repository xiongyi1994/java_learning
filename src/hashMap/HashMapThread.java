package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.mysql.fabric.xmlrpc.base.Value;

public class HashMapThread {
	/*
	 * HashMap在多线程中的安全问题
	 * 
	 * 当多个线程对同一个hashMap对象进行put处理时，put不同的key，会出现put不完全的情况
	 * 例如：有50个线程都put，但是可能只有38个成功地put
	 * 
	 * 当多个线程对同一个hashMap对象进行put处理时，put相同的key时，会不知道最后put的是哪一个线程
	 * 
	 * 当多个线程对同一个hashMap对象进行get处理时，get不同的key和get相同的key，都不会出现安全问题
	 * */
	
	public static void main(String[] args) {
		
		putSameTest();
//		putDifferentTest();
//		getSameKeyTest();
//		getDifferentKeyTest();
		
	}
	
	private static void putSameTest() {
		HashMap<String, String> hashMap = new HashMap<>();
		final int THREAD_NUM = 50;
		for (int i = 0; i < THREAD_NUM; i++) {
			final int threadId = i;
			new Thread() {
				public void run() {
					hashMap.put("key1", "value" + threadId);
				};
			}.start();
		}
		
		int count = 0;
		for (Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(count + " Key: " + entry.getKey() + " ===> " + "Value: " + entry.getValue());
			count++;
		}
	}
	
	private static void putDifferentTest() {
		HashMap<String, String> hashMap = new HashMap<>();
		final int THREAD_NUM = 50;
		for (int i = 0; i < THREAD_NUM; i++) {
			final int threadId = i;
			new Thread() {
				public void run() {
					hashMap.put("key" + threadId, "value" + threadId);
				};
			}.start();
		}
		
		int count = 0;
		for (Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(count + " Key: " + entry.getKey() + " ===> " + "Value: " + entry.getValue());
			count++;
		}
	}
	
	private static void getSameKeyTest() {
		HashMap<String, String> hashMap = new HashMap<>();
		final int THREAD_NUM = 50;
		for (int i = 0; i < THREAD_NUM; i++) {
			hashMap.put("key" + i, "value" + i);
		}
		int count = 0;
		for (int i = 0; i < THREAD_NUM; i++) {
			int threadId = i;
			new Thread() {
				public void run() {
					String tempValue = hashMap.get("key1");
					System.out.println(" Thread " + threadId + " Key: key1" + " Value: " + tempValue);
				};
			}.start();
		}
	}
	
	private static void getDifferentKeyTest() {
		HashMap<String, String> hashMap = new HashMap<>();
		final int THREAD_NUM = 50;
		for (int i = 0; i < THREAD_NUM; i++) {
			hashMap.put("key" + i, "value" + i);
		}
		int count = 0;
		for (int i = 0; i < THREAD_NUM; i++) {
			int threadId = i;
			new Thread() {
				public void run() {
					String tempValue = hashMap.get("key" + threadId);
					System.out.println(" Thread " + threadId + " Key: key" + threadId + " Value: " + tempValue);
				};
			}.start();
		}
	}
	
	
}
