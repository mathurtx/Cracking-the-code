import java.util.ArrayList;
import java.util.Arrays;

class FindSubsets {
	public ArrayList<ArrayList<Integer>> findSubsets(ArrayList<Integer> superset) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int size = superset.size();
		int max_combinations = 1 << size;
		for(int i = 0; i < max_combinations; i++) {
			ArrayList<Integer> subset = new ArrayList<Integer>();
			for(int j = 0; j < size; j++) {	
				if((i & (1<<j)) > 0) {
					subset.add(superset.get(j));
				}
			}
			result.add(subset);
		}
		return result;
	}

	public static void main(String args[]) {
		FindSubsets findSubsets = new FindSubsets();
		ArrayList<Integer> superset = new ArrayList<>();
		superset.addAll(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<ArrayList<Integer>> combinations = findSubsets.findSubsets(superset);
		for(ArrayList<Integer> list: combinations) {
			for(Integer element : list) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}