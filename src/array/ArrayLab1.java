package array;

public class ArrayLab1 {

	public static void main(String[] args) {
		double[] x = {1.1,2.0,1.2,1.4,0.5,6.0};
		double y = 0.0;
		double z = 0.0;
		double k = 0.0;
		for (int i = 0; i < x.length; i++) {
			k += x[i];
			if( x[i] - y > 0 ) {
				y = x[i];
			}else {
				z = x[i];
			}
			k = k/x.length;
		}
		System.out.printf("max:%.1f, min:%.1f, avg:%.1f",y,z,k);
	}

}
