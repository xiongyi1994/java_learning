package file;

import java.io.File;

public class Constructor {
	public static void main(String[] args) {
		
		/*
		 * File(String pathname)
		 * */
		File file = new File("/Users/xiongyi/Documents/workspace/java_learning/source/test.txt");
		File file2 = new File("./source/test.txt"); //为什么是这个
		System.out.println(file.exists());
		System.out.println(file2.exists());
	}
}
