package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//只能加String
		list.add("Hello");
		list.add(0,"World");
//		Integer a= new Integer(3);//把int包裝成物件 boxing
//		int x= a.intValue();//unboxing
//		list.add(3);//autoBoxing ()裡是new Integer(3)
		String xx ="1";
		int aa= Integer.parseInt(xx);
		System.out.println("字串轉數字"+aa);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println("size="+list.size());
		
		for (int i = 0; i < list.size(); i++) {
			Object item =list.get(i);
			System.out.println(item);
		}
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			Object item =it.next();
			System.out.println("Iterator next = "+item);
		}
		
		for (String item : list) {
			System.out.println(item);
		}
		
	}

}
