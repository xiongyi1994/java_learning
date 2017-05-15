package comparable;

class BinaryTree{
	class Node {
		private Comparable data; 
		private Node left;
		private Node right;
		public void addNode(Node newNode){
			if(newNode.data.compareTo(this.data) < 0){
				if(this.left == null){
					this.left = newNode;
				}else{
					this.left.addNode(newNode);
				}
			}
			if(newNode.data.compareTo(this.data) > 0){
				if(this.right == null){
					this.right = newNode;
				}else{
					this.right.addNode(newNode);
				}
			}
		}
	}
}

public class Comparable03 {
	/*
	 * 利用比较器实现二叉树操作
	 * */
	
}
