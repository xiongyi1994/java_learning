package map;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    /*
     * Map每次操作的是一对对象
     *
     * Map接口的常用子类:
     *
     * HashMap: 无序存放，是新的操作类，key不允许重复，线程不安全
     * Hashtable: 无序存放，是旧的操作类，key不允许重复，线程安全
     * TreeMap: 可以排序的Map集合，按集合中的key排序，key不允许重复
     * WeakHashMap: 弱引用的Map集合，当集合中的某些内容不再使用时清除掉无用的数据，使用gc进行回收
     * IdentityHashMap: key可以重复的Map集合
     * */
    public static void main(String[] args) {
        Map<String, Integer> map = null;
        HashMap<String, Integer> hashMap;
    }
}
