package hashMap;

public class MyHashMap<K, V> {
	
	transient Node<K, V>[] table;
	
	static class Node<K,V> {
		final int hash;
		final K key;
		V value;
        Node<K,V> next;
        
        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
	}
	
	static int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}
	
	public V put(K key, V value) {
		return putVal(hash(key), key, value);
	}
	
	public V putVal(int hash, K key, V value) {
		
		Node<K, V>[] tab;
		Node<K, V> p;
		int n, i;
		
		// 如果tab为空则创建
		if((tab = table) == null || (n = table.length) == 0) {
			tab = resize();
			n = tab.length;
		}
		
		// 计算index并对null做处理
		if ((p = tab[i = (n - 1) & hash]) == null) {
			tab[i] = newNode(hash, key, value);
		} else {
			Node<K,V> e;
			K k;
			// 节点存在
			if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k)))) {
				
			}
		}
		
		return null;
	}
	
	Node<K, V> newNode(int hash, K key, V value) {
		return null;
	}
	
	final Node<K, V>[] resize() {
		return null;
	}
	
}
