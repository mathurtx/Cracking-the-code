import java.util.ArrayList;

class FindSum {
	public void findSum(int level, ArrayList<Integer> result, Node root, int sum) {
		if(root == null) {
			return; 
		}
		int temp = sum;
		result.add(root.data);
		for(int i = level; i>-1; i--) {
			temp-=result.get(i);
			if(temp == 0) {
				printResult(result, level, i);
			}
		}
		ArrayList<Integer> left = (ArrayList<Integer>)result.clone();
		ArrayList<Integer> right = (ArrayList<Integer>) result.clone();
		findSum(level+1, left, root.left, sum);
		findSum(level+1, right, root.right, sum);
	}

	void printResult(ArrayList<Integer> result, int level, int index) {
		for(int i = index; i <= level; i++) {
			System.out.print(result.get(i));
		}
		System.out.println();
	}

	class Node{
		Node left;
		Node right;
		int data;
	}

}