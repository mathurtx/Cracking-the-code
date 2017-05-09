class Successor {
	public Node findSuccessor(Node node) {
		Node successor;
		if(node == null) {
			return null;
		}
		if(node.parent == null || node.right!=null) {
			successor = findLeftmostNode(node.right);
		}
		else {
			while((successor=node.parent)!=null) {
				if(successor.left == node) {
					break;
				}
				node = successor;
			}
		}
		return successor;
	}

	public Node findLeftmostNode(Node node) {
		if(node == null) {
			return null;
		}
		while(node.left!=null) {
			node = node.left;
		}
		return node;
	}

	public static void main(String args[]) {
		Successor successor = new Successor();
		successor.run();
	}

	public void run() {
		Node root = new Node(10);
		root.left = new Node(5);
		root.left.parent = root;
		root.right = new Node(15);
		root.right.parent = root;
		root.left.left = new Node(3);
		root.left.left.parent = root.left;
		root.right.left = new Node(17);
		root.right.left.parent = root.right;
		Node a = new Node(7);
		root.left.right = a;
		root.left.right.parent = root.left;
		Node x = findSuccessor(a);
		if(x!=null){
			System.out.println("InOrder Successor of " + a.data + " is " + x.data);
		}else{
			System.out.println("InOrder Successor of " + a.data + " is NULL");
		}
		x = findSuccessor(root);
		if(x!=null){
			System.out.println("InOrder Successor of " + root.data + " is " + x.data);
		}else{
			System.out.println("InOrder Successor of " + root.data + " is NULL");
		}
	}
}




class Node {
	int data;
	Node right;
	Node left;
	Node parent;

	Node(int data) {
		this.data = data;
	}
}


