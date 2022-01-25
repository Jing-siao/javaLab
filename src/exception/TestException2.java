package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestException2 {

	public static void main(String[] args)  {
		try {
			checkFile("c:\\aaa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}
	//throws RuntimeException就不會強制檢查
	public static void checkFile(String filePath) throws FileNotFoundException{
		File file = new File(filePath);
		if(!file.exists()) {
			FileNotFoundException fne =new FileNotFoundException();
			throw fne;
		}
	}
}
