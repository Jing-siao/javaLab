package interFace;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimCard extends Product implements Warrantable, Expirable {
	public int warranty;// 保固天數
	private Date expireDate;

	public SimCard(String name, int price, int warranty, Date expireDate) {
		super(name, price);
		this.warranty = warranty;
		this.expireDate = expireDate;
	}

	@Override
	public String desc() {
		String description = super.desc();
		SimpleDateFormat format =new SimpleDateFormat("yyyy/MM/dd E");
		String dateFormat = format.format(expireDate);
		return String.format("%s,%s之前開卡,可用%d天", description, dateFormat,warranty);
	}

	@Override
	public Date expDate() {
		return expireDate;
	}

	@Override
	public int wardays() {
		return warranty;
	}
}
