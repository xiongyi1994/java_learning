package array;

import java.util.Arrays;

public class Arrays_sort {
	
	/*
	 * java Arrays 类库中自带排序的操作
	 * */
	
	public static void main(String[] args) {
		int array[] = {4,5,8,9,6,7,5,1,2,3,6,5,4,7,8,9};
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
	}
	
}
