import java.util.Iterator;

public class TestFor {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		// TODO Auto-generated method stub
		//奇數相加 ex:1
		for (int i = 1; i <= 100 ; i+=2) {
			sum = sum + i;
		};
		System.out.println(sum);
		//奇數相加 ex:2
		for (int i = 1; i <= 100 ; i++) {
			if(i%2==0) {
				//一執行到continue就會跳過，會跳出迴圈重新開始
				continue;
			}
			if(i >= 50) {
				//一執行到break就會中斷迴圈
				break;
			}
			sum1 = sum1 + i;
		};
		
		System.out.println(sum1);
		//while迴圈
		int j=0;
		int sumOfWhile = 0;
		while (j<=100) {
			sumOfWhile += j;
			j++;
		}
		System.out.println(sumOfWhile);
		
		//do while迴圈
		j = 1;
		int sumOfDoWhile = 0;
		do {
			sumOfDoWhile += j;
			j++;
		} while (j <= 100);
		System.out.println(sumOfDoWhile);
	}

}
