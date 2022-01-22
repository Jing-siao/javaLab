package encap;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Car('B');
		//c.model = "Prius";
//		c.setModel("Prius11");
		//c.price = 100000;
		
		System.out.printf("型號:%s,價錢:NT$%d元,顏色:%s%n", car.getModel(), car.getPrice(),car.getColor());

	}

}
