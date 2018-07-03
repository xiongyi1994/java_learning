package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream {

	/*
	 * Arrays.stream() 返回数组的顺序流
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 9, 1, 5 };
		IntStream is = Arrays.stream(arr);
		is.forEach(i -> System.out.println("arr value = " + i));
	}
}
