package singlyLinkList;

public class LinkDeom01 {

	public static void main(String[] args) {
		
		Node root = new Node("火车头");
		Node n1 = new Node("车厢-A");
		Node n2 = new Node("车厢-B");
		Node n3 = new Node("车厢-C");
		
		root.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		
		printNode(root);
		
	}

	public static void printNode(Node node) {

		System.out.println(node.getData() + "\t");
		if(node.getNext() != null){
			printNode(node.getNext());
		}
		
	}
	
}
