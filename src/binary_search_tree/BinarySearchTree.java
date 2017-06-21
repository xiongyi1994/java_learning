package binary_search_tree;

public class BinarySearchTree {
	
	static class Node{
		private float data;
		private Node lchild;
		private Node rchild;
		public Node(float data){
			this.data = data;
		}
		public void print(){
			String lchildData = (this.lchild == null)? "null" : String.valueOf(this.lchild.data) ;
			String rchildData = (this.rchild == null)? "null" : String.valueOf(this.rchild.data) ;
			System.out.println("node data " + this.data + "; lchild is " + lchildData + "; rchild is " + rchildData);
			if(this.lchild != null){
				this.lchild.print();
			}
			if(this.rchild != null){
				this.rchild.print();
			}
		}
		static void printMax2Min(Node node){
			if(node == null)
				return;
			printMax2Min(node.rchild);
			System.out.print(String.valueOf(node.data) + '、');
			printMax2Min(node.lchild);
		}
		static void printMin2Max(Node node){
			if(node == null)
				return;
			printMin2Max(node.lchild);
			System.out.print(String.valueOf(node.data) + '、');
			printMin2Max(node.rchild);
		}
		public void add(Node newNode){
			if(newNode.data > this.data){
				if(this.rchild == null){
					this.rchild = newNode;
				}else{
					this.rchild.add(newNode);
				}
			}else if(newNode.data < this.data){
				if(this.lchild == null){
					this.lchild = newNode;
				}else{
					this.lchild.add(newNode);
				}
			}else{
				System.out.println("the data " + newNode.data + " you want to save is exist");
			}
		}
		static boolean find(Node node,float data){
			if(node == null)
				return false;
			if(node.data == data)
				return true;
			else if(node.data > data)
				return find(node.lchild, data);
			else 
				return find(node.rchild, data);
		}
		public void delete(float data){
			if(this.data == data){
				
			}
		}
	}
	
	private Node root;
	
	public void addNode(float data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
		}else{
			root.add(newNode);
		}
	}
	
	public void deleteNode(float data){
		this.root.delete(data);
	}
	
	public void printAllNode(){
		if(this.root != null){
			this.root.print();
		}
	}
	
	public void printDataMax2Min(){
		if(this.root != null){
			Node.printMax2Min(root);
		}
	}
	
	public void printDataMin2Max(){
		if(this.root != null){
			Node.printMin2Max(root);
		}
	}
	
	public boolean findNode(float data){
		return Node.find(root,data);
	}
}
