package innerClass;

public class ClassA {
	private double weight;
	private double height;
	public ClassA(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public void printBMI() {
		InnerClass inner = new InnerClass();
		double bmi= inner.calcBMI();
		System.out.println("BMI="+bmi);
	}
	//內部類別
	private class InnerClass{
		public double calcBMI() {
			return weight / (height*height);
		}
	}
}
