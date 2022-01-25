package interFace;

public interface Warrantable {
	public static final int MAX_WARRANTY = 365;//介面常數public static final可省略
	
	public int wardays(); 
	//default方法可以於實作時被複寫(override)
	//static方法不能被複寫
	//default static 兩者不能同時使用
	default int examFee() {
		return 500;
	}
}
