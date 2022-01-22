
public class TestBasic {

	public static void main(String[] args) {
		// 宣告:型態 變數名稱
        long salary;
        salary = 20000;
        System.out.println(args[0] +" salary = " + salary);
        
        int i = 0, j = 1, k = 2;
        System.out.println(i);
        
        //在Java開發時如果輸入整數預設為int型態最多只能輸入到21億，要輸
        //入超過21億必須加L於字尾，表⽰為long型態
        
        long salaryOfMary = 2200000000L;
        //overflow資料溢位
        int overflow = 2100000000 + 2100000000;
        System.out.println(overflow);
        
        int x=10;
        int y=3;
        int z=x/y;
        System.out.println(z);
	}

}
