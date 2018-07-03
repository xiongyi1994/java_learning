package concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap01 {
    /*
     * HashTable和ConcurrentHashMap都适用于多线程环境
     * HashTable的大小增加到一定的时候，性能会急剧下降，因为迭代时需要被锁定很长的时间
     * ConcurrentHashMap引入了分割，只需锁定map的某个部分
     *
     * */
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();
    }
}
