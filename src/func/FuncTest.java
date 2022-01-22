package func;

public class FuncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = add(1, 2);
		System.out.println("sum = " + sum);
		add1(1, 5);
	}

	// int 為回傳值得型態 一定要有return
	public static int add(int a, int b) {
		int s = a + b;
		return s;
	}

	// void 沒有回傳 不用return
	public static void add1(int a, int b) {
		int s = a + b;
		System.out.println("總和 = " + s);
	}
}
