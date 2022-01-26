package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestThreeSet {
	//TreeSet自動排序
	public static void main(String[] args) {
		//匿名class
		Comparator c= new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				System.out.printf("i1=%d,i2=%d%n",i1,i2);
				//o1排比o2前面就-1
				if(i1>i2) {
					return- 1;
				}else if (i1<i2) {//o1排比o2後面就1
					return 1;
				}else {
					return 0;//一樣就回傳0
				}
			}
		};
//		DescComparator dc = new DescComparator();
		Set set = new TreeSet(c);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(3);
		
		for (Object item : set) {
			System.out.println(item);
		}

	}

}
