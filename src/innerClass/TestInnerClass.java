package innerClass;

import interFace.Account;

public class TestInnerClass {

	public static void main(String[] args) {
		ClassA a = new ClassA(80, 1.8);
		a.printBMI();
		Account acc = new Account() {
			
			@Override
			public void declare() {
			}
		};
	}

}
