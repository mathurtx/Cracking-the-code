class SubTree {
	
	public boolean ifSubtree(Node root, Node subtreeRoot) {
		String rootInorder = inOrder(root,"");
		String subtreeInorder = inOrder(subtreeRoot,"");
		if(rootInorder.contains(subtreeInorder)) {
			return true;
		}
		return false;
	}

	public String inOrder(Node root, String result) {
		if(root == null) {
			return result;
		}
		inOrder(root.left, result);
		result+=root.data;
		inOrder(root.right, result);
		return result;
	}

	public boolean ifSubtree_v2(Node root, Node subtreeRoot) {
		if(root == null || subtreeRoot == null) {
			return false;
		}
		return matchTree(root, subtreeRoot);
	}

	public boolean match(Node root, Node subtreeRoot) {
		if(root == null){
			return false;
		}
		if(root.data == subtreeRoot.data) {
			return matchTree(root, subtreeRoot);
		}
		return match(root.left, subtreeRoot) || match(root.right, subtreeRoot);
	}

	public boolean matchTree(Node root, Node subtreeRoot) {
		if(root == null && subtreeRoot == null) {
			return true;
		}
		if(root == null || subtreeRoot == null) {
			return false;
		}
		if(root.data == subtreeRoot.data) {
			return (matchTree(root.left, subtreeRoot.left) && matchTree(root.right, subtreeRoot.right));
		}
		return false;
	}
}

	class Node {
	int data;
	Node right;
	Node left;

	Node(int data) {
		this.data = data;
	}
}


