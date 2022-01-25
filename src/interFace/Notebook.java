package interFace;

import java.io.Serializable;

//多個型態:Notebook,Product,Warrantable
//Serializable 空介面
public class Notebook extends Product implements Warrantable,Serializable{// 繼承父類別 建構方法不會繼承
	public int warranty;// 保固天數
	@Override
	public int wardays() {//子類別必須實作
		// TODO Auto-generated method stub
		return warranty;
	}
	
	//override 重新改寫父類別的方法
	//1.方法名稱，參數型別個數，回傳值型態都必須與父類別一樣
	//2.如果回傳值為類別，可以回傳該類別的子類別
	//3.存取控制不可小於父方法，例如父類別為protected,子類別只能是protected或public
	//annotation
	@Override
	public String desc() {
		// shift+Alt+L 可以自動產生前面要接的變數，游標需停在方法()後面
		String info = super.desc();
		// 子類別透過super關鍵字呼叫父類別方法
		// 子類別建構方法呼叫父類別建構方法 super(name,price)
		return String.format("%s,保固%d天",info,this.warranty);
	}
	
	public Notebook(String name, int price, int warranty) {
		super(name, price);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}



}
