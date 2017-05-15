package systemLearning;

public class CurrentTimeMillis {
	/*
	 * 
	 * 返回以毫秒为单位的当前时间
	 * */
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		System.out.println("---------------------------");
		
		/*
		 * 可以用来计算程序的执行时间
		 * */
		long startTime = System.currentTimeMillis();
		int sum = 0;
		
		for (int i = 0; i < 30000000; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("计算所话费的时间：" + (endTime - startTime) + "毫秒");
	}
}
