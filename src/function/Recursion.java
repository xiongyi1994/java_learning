package function;

public class Recursion {
	/*
	 * 递归：方法自己调用自己
	 * */
	
	/*求和递归示例*/
	
	public static void main(String[] args) {
		System.out.println("计算结果：" + sum(100));
	}
	
	public static int sum(int num) {
		if(num == 1){
			return 1;	
		}else{
			return num + sum(num -1);
		}
	}
}
