package array;

import java.util.Iterator;

public class TestArray {

	public static void main(String[] args) {
//		int[] ages = new int[10];
		int[] ages = { 1, 2, 3 };
		System.out.println(ages[2]);
		ages[0] = 1;
		ages[1] = 200;
		ages[2] = 300;
		System.out.println(ages[2]);
		System.out.printf("長度%d%n", ages.length);

		int[][] x = { { 1, 2, 3 }, { 4, 5 } };
		x[0][1] = 2;
		x[1][1] = 3;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.println(x[i][j]);
			}
		}
		for (int item : ages) {//類似js foreach int陣列，左方的宣告就必須是int
			System.out.println(item);
		}
		System.out.println("---------");
		for (int[] row : x) {
			for (int item  : row) {
				System.out.println(item);
			}
		}
	}

}
