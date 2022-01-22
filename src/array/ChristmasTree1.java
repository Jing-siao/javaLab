package array;

public class ChristmasTree1 {

	public static void main(String[] args) {
		int x = 5;
		int all = x * 2 - 1;
		String blank = " ";
		String star = "*";
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < (all - (i * 2 + 1)) / 2; j++) {
				System.out.print(blank);
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
