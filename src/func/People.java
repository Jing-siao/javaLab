package func;

public class People {
	//static靜態屬性或類別屬性，只要有類別就可以使用，類別名稱+.
	static double overWeightBMI = 24;//常數
	//static類別方法，靜態方法，不需要物件，下方物件屬性都不能用
	public static double BMI(double w,double h) {
		return w/(h*h);
	}
	
	
	//--------------------
	//物件屬性
	double height;
	double weight;
	//物件方法 要先new才可以用
	public double getBMI() {
		//double bmi = weight / (height * height);
		//可以呼叫靜態方法
		double bmi = BMI(weight,height);
		return bmi;
	}
}
