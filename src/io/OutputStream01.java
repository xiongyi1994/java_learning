package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStream01 {
	/*
	 * 向文件中写入字符串
	 * */
	public static void main(String[] args) throws Exception {
		File file = new File("." + File.separator + "source" + File.separator + "createdFile.txt");
		OutputStream outputStream = null;
		outputStream = new FileOutputStream(file);
		String string = "Hello World";
		byte b[] = string.getBytes(); //只能输出byte数组，所以将字符串变为byte数组
		
		outputStream.write(b);
		outputStream.close();
	}
}
