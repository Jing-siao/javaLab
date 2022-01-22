
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Jing";
		String name1 = "Jing";//一樣的會直接從pool撈
		System.out.println(name == name1);
		String name2 =new String("Jing") ;
		System.out.println(name == name2);//雖然一樣在heap區但卻在pool外面
		String hello = "hello";
		name = hello + "Jing"; //+號 文字不會在pool區內
		
		String name3 = "helloJing";
		System.out.println(name == name3);
		System.out.println(name1.equals(name2));//文字比較
		
		System.out.println("iSpan".length());//文字長度
		System.out.println("iSpan305".indexOf("Span"));//找字
		
		if ("iSpan305".contains("Span")) {
			System.out.println("contains 有這個字");
		}
		System.out.println("iSpan305".substring(5));//頭含 往後截
		System.out.println("iSpan305".substring(5,7));//頭含 尾不含
		
		System.out.println(String.format("%s,%s%nNT$%6.1f元,%5d%%","Hello","Jing",100.5432,2000));
		//%6.1f 總長6位，包含小數點，.1算到小數點後1位 四捨五入
	}

}
