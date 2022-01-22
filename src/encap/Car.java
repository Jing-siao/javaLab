package encap;

public class Car {
	//屬性變成 private
	private String model;
	private int price;
	private char color;
	//封裝透過方法傳
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		if(model.equals("Prius")) {
			price = 1099000;
		}else if (model.equals("Yaris")) {
			price = 57500;
		}else {
			System.out.println("型號有設錯");
		}
	}
	public int getPrice() {
		return price;
	}
	//constructor建構方法 名稱一定要跟class一樣，給予屬性預設值
	//不能有回傳值
	//編譯器會自動生成，可以呼叫,若已有寫compile
	//則不會產生就不能用new car()
	public Car (char color) {
		//呼叫class的其他建構方法，一定要在第一行
		//沒有.
		this(color,"Yaris");
		//char要用單引號
		//this.color = color;
		
	}
	
	public Car(String model, int price, char color) {
		this.model = model;
		this.price = price;
		this.color = color;
	}
	//overloaded constructor
	public Car (char color,String model) {
		this.color = color;
		this.model = model;
		setModel(model);
		
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	
	
}
