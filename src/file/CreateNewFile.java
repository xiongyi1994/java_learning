package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	/*
	 * file.createNewFile();
	 * 创建一个文件
	 * */
	public static void main(String[] args) {
		File file = new File("./source/createdFile.txt");
		try{
			file.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
