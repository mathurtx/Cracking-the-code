/**
 * Review again
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class LinkTree {
	public static void main(String args[]) {
		LinkTree linkTree = new LinkTree();
		TreeNode root = linkTree.createTree();
		ArrayList<LinkedList<TreeNode>> result = linkTree.findLevelLinkedList(root);
	}
	

	public TreeNode createTree() {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(8);
		TreeNode node6 = new TreeNode(9);
		TreeNode node7 = new TreeNode(10);
		TreeNode node8 = new TreeNode(11);
		TreeNode node9 = new TreeNode(12);
		TreeNode node10 = new TreeNode(13);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		node3.left = node7;
		node3.right = node8;
		node4.left = node9;
		node4.right = node10;
		return root;
	}

	public ArrayList<LinkedList<TreeNode>> findLevelLinkedList(TreeNode root) {
		int level = 0;
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();
		LinkedList<TreeNode> list = new LinkedList<>();
		list.add(root);
		result.add(level, list);
		while(true) {
			list = new LinkedList<TreeNode>();
			for(int i = 0; i < result.get(level).size(); i++) {
				TreeNode node = (TreeNode) result.get(level).get(i);
				if(node!=null) {
					if(node.left!=null) {
						list.add(node.left);
					}
					if(node.right!=null) {
						list.add(node.right);
					}
				}
			}
			if(list.size()>0) {
				result.add(level+1, list);
			} else {
				break;
			}
			level++;
		}
		return result;
	}
	
}

class TreeNode {
	int value;
	TreeNode right;
	TreeNode left;

	TreeNode(int value) {
		this.value = value;
	}
}