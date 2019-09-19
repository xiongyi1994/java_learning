package algorithm.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,1,23,4,6,576,75,63,4534,5};
		bubbleSort(arr);
		print(arr);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = arr.length; i > 0; i--) {
			for (int k = 0; k < i - 1; k++) {
				if (arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
	}

	private static void print(int[] a) {
        for (int anA : a) {
            System.out.print(anA + "、");
        }
    }

}