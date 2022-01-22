package func;

public class PeopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People();
		p.height=1.7;
		p.weight=70;
		double b= p.getBMI();
		System.out.printf("BMI=%.2f%n",b);
		System.out.println("overWeightBMI = "+ People.overWeightBMI);
		System.out.println("BMI = "+ People.BMI(70,1.8));
		System.out.println(Math.pow(2, 3));//2的3次方
		//join第一個參數是串接符號
		System.out.println(String.join(",", "a","b","c"));
	}

}
