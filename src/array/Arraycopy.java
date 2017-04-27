package array;

public class Arraycopy {
	/*
	 * Array.copy() 可以将一个数组的内容复制到另外一个数组
	 * 参数：源数组名称、 源数组开始点、 目标数组名称、 目标数组开始点、 复制长度
	 * */
	
	public static void main(String[] args) {
		int array1[] = {1,2,3,4,5};
		int array2[] = {6,7,8,9,10};
		
		System.arraycopy(array1, 0, array2, 0, 5);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "\t");
		}
		
	}
}
