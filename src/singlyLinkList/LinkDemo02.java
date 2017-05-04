package singlyLinkList;

public class LinkDemo02 {
	
	public static void main(String[] args) {
		
		Link link = new Link();
		link.addNode("A");
		link.addNode("B");
		link.addNode("C");
		link.addNode("D");
		link.addNode("E");
		System.out.println("===========删除之前=========");
		link.printNode();
		link.deleteNode("C");
		link.deleteNode("D");
		System.out.println();
		System.out.println("===========删除之后=========");
		link.printNode();
		System.out.println();
		System.out.println("查询节点：" + link.contains("A"));
		
	}
	
}
