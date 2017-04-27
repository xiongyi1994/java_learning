package array;

public class BubbleSort {
	public static void main(String[] args) {
		int array[] = {5,5,7,6,1,9,8,7,2,3};
		sort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
	}
	public static void sort(int array[]) {
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0 ; j < array.length - 1 -i; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
