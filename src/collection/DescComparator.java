package collection;

import java.util.Comparator;

public class DescComparator implements Comparator{

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
	
}
