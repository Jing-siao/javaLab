package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {

		Notebook nb = new Notebook("Asus", 20000, 365);
		System.out.printf("名稱:%s,價格:%d元,%n", nb.getName(), nb.getPrice());
		System.out.println(nb.name);
		System.out.println(nb.desc());
		//多形 有不同型態 真正的物件還是Notebook
		Product item = nb;
		System.out.println(item.desc());
		// item.getWarranty();//這型態沒有getWarranty()
		// nb.getWarranty();
		//改成方法
		Date expDate = Product.getDate(2021, Calendar.DECEMBER, 28);
		Food f = new Food("肉鬆",100,expDate);
		Product itemF = f;
		System.out.println(f.desc());
		
		//這樣100個商品，方法就要呼叫100次，就要利用多形
		//buy(nb);
		//buy(f);
		SimCard sim = new SimCard("英國漫遊", 1000, 7, Product.getDate(2022, Calendar.JANUARY, 31));
		System.out.println(sim.desc());
		
		//改成陣列
		Product[] items = {nb,f};
		buy(items);
//		Notebook item3=item;//因為右邊item是product但左邊是notebook,product不一定是notebook，有客能是food
//		Notebook item3=(Notebook)item;//(Notebook)強制轉型，可以轉
//		Food item5 = (Notebook) item;//此兩種不一樣，則會出錯
		
		//instanceof可以偵測有沒有這個型態，有就回傳true沒有false
		//在強制轉型之前都會檢查一次
		if(itemF instanceof Notebook) {
			Notebook item4=(Notebook)itemF;
		}
		
	}
	//這樣100個商品，方法就要寫100次，就要利用多形，這兩種都有Product的型態
	//	public static void buy(Notebook nb) {
	//		System.out.println("買入:"+nb.desc());
	//	}
	//	public static void buy(Food food) {
	//		System.out.println("買入:"+food.desc());
	//	}
	//只用一個方法
	public static void buy(Product[] ps) {
		int sum = 0;
		Date now = new Date();
		for (Product p : ps) {
			//檢查是否已過期
			if(p instanceof Expirable) {//Food,SimCard有實作Expirable
				Expirable item =(Expirable)p;//強制轉型為介面 可以同時處理Food,SimCard，p是product
				if(item.expDate().before(now)) {
					System.out.println(p.desc()+"已過期，無法購買");
					continue;
				}
			}
			System.out.println("買入:"+p.desc());
			sum += p.getPrice();
		}
		System.out.println("買入總金額" + sum);
	}
	
}
