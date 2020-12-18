package collection.queue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueue01 {

    static LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

    static {
        for (int i = 0; i < 10; i++) {
            queue.offer(String.valueOf(i));
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                queue.poll();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!queue.offer("11")) {
                    System.out.println("队列满了，等待插入");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("队列插入成功");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    queue.offer("12", 6, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

//        t2.start();
        t3.start();

        Thread.sleep(5000);

        t1.start();

//        t2.join();
        t3.join();
        t1.join();

        System.out.println(queue.size());
        System.out.println(queue.toString());

    }

}
