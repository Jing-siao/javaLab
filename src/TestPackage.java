import category.*;//引用全部
//import category.Item;//引用單一的class
public class TestPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//category.Item item = new category.Item();
		//要使用全名category.Item 
		Item item = new Item();//有import  category.Item 就可以使用短名
		item.name="Asus notebook";
		System.out.println(item.name);
		
		CountDown c = new CountDown(5);
		c.run();
	}

}
