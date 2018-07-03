package treeMap;

import java.util.HashMap;
import java.util.UUID;

public class HashMap02 {
	/*
	 * 多线程测试HashMap
	 * */
	public static void main(String[] args) throws InterruptedException {
		final HashMap<String, String> hashMap = new HashMap<String,String>(2);
		Thread t = new Thread(new Runnable() {
		    @Override
		    public void run() {
		        for (int i = 0; i < 10000; i++) {
		            new Thread(new Runnable() {
		                @Override
		                public void run() {
		                    hashMap.put(UUID.randomUUID().toString(), "");
		                }
		            }, "ftf" + i).start();
		        }
		    }
		}, "ftf");
		t.start();
		t.join();
	}
}
