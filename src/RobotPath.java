import java.util.ArrayList;
import java.util.List;

class RobotPath {
	public List<String> findRobotPath(int row_max, int col_max) {
		List<String> pathList = new ArrayList<String>();
		getPathList(0, 0, row_max, col_max, "", pathList);
		return pathList;
	}

	public void getPathList(int row, int col, int row_max, int col_max, String path, List<String> pathList) {
		path+=String.format(" (%d,%d)", row,col);
		if(row == row_max && col == col_max) {
			pathList.add(path);
		}
		if(row>row_max || col>col_max) {
			return;
		}
		getPathList(row, col+1, row_max, col_max, path, pathList);
		getPathList(row+1, col, row_max, col_max, path, pathList);
	}

	public static void main(String args[]) {
		RobotPath robotPath = new RobotPath();
		ArrayList<String> pathList = (ArrayList<String>) robotPath.findRobotPath(4,4);
		for(String path: pathList) {
			System.out.println(path);
		}
	}
}