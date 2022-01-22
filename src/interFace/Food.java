package interFace;

import java.util.Date;
//多個型態:Food,Product,Warrantable
public class Food extends Product implements Expirable{

    private Date expireDate;
	@Override
	public Date expDate() {
		return expireDate;
	}


    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        description = description +",到期日："+expireDate;
        return description;
    }


}
