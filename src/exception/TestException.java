package exception;

public class TestException {

	public static void main(String[] args) {
		try {
			int a= 1;
			int c=1;
			System.out.println("c="+c);
			int b= a/c;
			System.out.println("b="+b);
			
			int [] ages= {};
			System.out.println(ages[0]);
			//system.err.print()印出來錯誤跟正確的執行順序不一定
		} catch (ArithmeticException ex) {
			ex.printStackTrace();//印出為甚麼錯
			System.out.println("除上0,發生錯誤");
		}catch (ArrayIndexOutOfBoundsException ex) {
			//可以多個catch
			ex.printStackTrace();
		}catch (Exception e) {
			//Exception為多形，所以的子錯誤皆為Exception的一種，
			//如果把catch (Exception e)放在最上面會發生錯誤，因為是父類別做完下面的catch就不會再繼續做
			e.printStackTrace();
		}finally {
			System.out.println("finally最後一定會執行的程式區塊");
		}
		System.out.println("done");
	}

}
