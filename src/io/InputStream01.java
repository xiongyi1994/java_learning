package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStream01 {
	public static void main(String[] args) throws Exception {
		File file = new File("." + File.separator + "source" + File.separator + "createdFile.txt");
		InputStream inputStream = null;
		inputStream = new FileInputStream(file);
		
		byte b[] = new byte[(int) file.length()];
		int len = inputStream.read(b);
		inputStream.close();
		System.out.println("内容为：" + new String(b, 0, len));
	}
}
