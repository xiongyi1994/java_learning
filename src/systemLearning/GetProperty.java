package systemLearning;

public class GetProperty {
	public static void main(String[] args) {
		/*
		 * System.getProperty("user.dir")
		 * 获得当前目录
		 * */
		System.out.println(System.getProperty("user.dir")); 
		// -> /Users/xiongyi/Documents/workspace/java_learning
		/*
		 * 获得当前系统编码
		 * */
		System.out.println(System.getProperty("file.encoding"));
	}
}
