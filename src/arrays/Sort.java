package arrays;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		Integer a[] = {1,5,6,4,7,8,9};
		Arrays.sort(a);
		print(a);
	}
	
	static <T> void print(T array[]){
		for(int i = 0;i < array.length;i++){
			System.out.print(array[i]);
		}
	}
	
}
