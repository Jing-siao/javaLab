package interFace;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Product {
	//abstract抽象方法，父類別沒有實作，會交由子類別實作,class也要加上abstract
	// public abstract void calc();
	//final
	public static final double TAX;
	static {
		//最多只會執行一次
		TAX = 0.05;
		System.out.println("Product's static block");
	}
	
	public static Date getDate(int year,int month,int day){
		GregorianCalendar calendar = new GregorianCalendar(year,month,day);
		Date expDate = calendar.getTime();
		return expDate;
	}
	// protected主要開放給子類別使用 同一個package也能讀到
	//protected String name;
	//protected int price;
	// 前面沒有寫代表預設，只能給同一個package使用
	//final可以加在class前面 表示是不能被繼承
	String name;
	int price;
	public Product() {
	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String desc() {
		return String.format("商品名稱:%s,價格:%d元", this.name,this.price);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
