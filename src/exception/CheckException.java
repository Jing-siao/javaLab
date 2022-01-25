package exception;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.zip.ZipException;
//throws 可以寫多個子類別，以逗號區隔(FileNotFoundException,ZipException)，或寫共同的父類別例如IOException
public class CheckException {

	public static void main(String[] args) throws IOException {
		
			FileReader fr = new FileReader("D:\\Java\\hello.jar");
			//用兩個反斜線或一個正斜線都可以 反斜線是跳脫字元所以要用兩個
//			FileReader fr = new FileReader("D:/Java/hello.jar");
			System.out.println("done");
		
	}

}
