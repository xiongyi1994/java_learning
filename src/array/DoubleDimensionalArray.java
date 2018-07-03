package array;

public class DoubleDimensionalArray {
	/*
	 * 二维数组
	 * Java语言中，由于把二维数组看作是数组的数组，
	 * 数组空间不是连续分配的，所以不要求二维数组每一维的大小相同。
	 * */
	
	public static void main(String[] args) {
		// 静态初始化一个二维数组
		int a[][] = {{1,2},{3,4},{5,6,7}};
		// 遍历输出这个二维数组
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
}
