package tree.binary_search_tree;

public class Demo1 {
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addNode(5);
		binarySearchTree.addNode(4);
		binarySearchTree.addNode(3);
		binarySearchTree.addNode(6);
		binarySearchTree.addNode(7);
//		binarySearchTree.printAllNode();
		binarySearchTree.printDataMax2Min();
		System.out.println();
//		binarySearchTree.printDataMin2Max();
		System.out.println();
//		System.out.println(binarySearchTree.findNode(3));
	}
}
