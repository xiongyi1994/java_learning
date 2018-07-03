package avl_tree;

import java.util.HashSet;

public class AvlNode<K, V> {
    private K key;
    public int height;
    public HashSet<V> attach = new HashSet<>();
    public AvlNode<K, V> left;
    public AvlNode<K, V> right;

    AvlNode(K key, V value, AvlNode<K, V> left, AvlNode<K, V> right) {
        this.key = key;
        this.attach.add(value);

        this.left = left;
        this.right = right;
    }

//    public AvlNode<K, V> RotateLL(AvlNode<K, V> node) {
//        AvlNode top = node.left;
//    }
}
