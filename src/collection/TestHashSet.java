package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add("hello");
		boolean success = set.add("hello");
		System.out.println(success);
		System.out.println("size="+set.size());
		set.add("world");
		set.add(3);
		System.out.println("size="+set.size());
		boolean helloExist = set.contains("hello");
		System.out.println("hello是否存在"+helloExist);
		
		for (Object item : set) {
			System.out.println(item);//HashSet沒有順序 LinkedHashSet有順序
		}
	}

}
