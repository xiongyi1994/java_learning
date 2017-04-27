package array;

public class MaopaoSort {
	public static void main(String[] args) {
		int array[] = {5,1,4,6,8,9,7,3,6};
		sort(array);
		print(array);
		
	}
	
	public static void sort(int temp[]) {
		for(int i=1;i<temp.length;i++){
			for(int j=0;j<temp.length;j++){
				if(temp[i]<temp[j]){
					int x = temp[i];
					temp[i] = temp[j];
					temp[j] = x;
				}
			}
		}
	}
	public static void print(int temp[]) {
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "\t");
		}
	}
}
