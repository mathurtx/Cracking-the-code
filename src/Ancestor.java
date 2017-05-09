/**
 * 
 * @author tanmaymathur
 *
 */
/**
 * Review again
 */
class Ancestor {

	public static final int TWO_NODES_FOUND = 2;
	public static final int ONE_NODE_FOUND = 1;
	public static final int NO_NODES_FOUND = 0;

	public Node findAncestor(Node root, Node p, Node q) {
		if(covers(root.left,p) && covers(root.left,q)) {
			findAncestor(root.left, p, q);
		}
		if(covers(root.right,p) && covers(root.right,q)) {
			findAncestor(root.right, p, q);
		}
		return root;
	}

	public boolean covers(Node node, Node child) {
		if(node == null) {
			return false;
		}
		if(child == null) {
			return false;
		}
		if(node == child) { 
			return true;
		}
		return covers(node.left, child) || covers(node.right, child);
	}

	public Node findAncestor_v2(Node root, Node p, Node q) {
		if(q == p && (root.right==p || root.left == q)) {
			return root;
		}
		int resultLeft = covers_v2(root.left, p, q);
		if(resultLeft == TWO_NODES_FOUND) {
			if(root.left == p || root.left == q) {
				return root.left;
			} 
			findAncestor(root.left, p, q);
		}
		else if(resultLeft == ONE_NODE_FOUND) {
			if(root == p) {
				return p;
			}
			else if(root == q) {
				return q;
			}
		}
		int resultRight = covers_v2(root.right, p, q);
		if(resultRight == TWO_NODES_FOUND) {
			if(root.right == p || root.right == q) {
				return root.right;
			}
			findAncestor(root.right,p, q);
		}
		else if(resultRight == ONE_NODE_FOUND) {
			if(root == p) {
				return p;
			}
			else if(root == q){
				return q;
			}
		}
		if(resultLeft == ONE_NODE_FOUND && resultRight == ONE_NODE_FOUND) {
			return root;
		}
		return null;
	}

	public int covers_v2(Node node, Node p, Node q) {
		int result = NO_NODES_FOUND;
		if(node == null) {
			return result;
		}
		if(node == p || node == q) {
			result++;
		}
		result+=covers_v2(node.left, p, q);
		if(result == TWO_NODES_FOUND) {
			return result;
		}
		result+=covers_v2(node.right, p, q);
		return result;
	}

	class Node {
	int data;
	Node right;
	Node left;

	Node(int data) {
		this.data = data;
	}
}
}


