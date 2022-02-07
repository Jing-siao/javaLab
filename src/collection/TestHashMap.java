package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<>();
		map.put("John",2000);//autoboxing
		map.put("David",1000);
		map.put("Tom",5000);
		map.put("Tom",2500);
		//put(key,value),如果原本的key值已經存在，則會覆蓋原有的value
		System.out.println("Tom's salsry="+map.get("Tom"));
		//keyset把所有的key包裝成一個set,set就可以用for迴圈
		Set<String> keySet = map.keySet();
			for (String key : keySet) {
				String name =(String)key;
				//map.get(key值)會取到這個key的value
				System.out.printf("name=%s,value=%s%n",name,map.get(key));
			}
		System.out.println("=====Entry Set=====");
		//Map Set 不會有順序 只有List才有順序
		//set裡面的Entry介面 String 為getKey() Integer為getValue() 這樣就不用轉型
		 Set<Entry<String, Integer>> entrySet = map.entrySet();
		int sum=0;
		for (Entry<String, Integer> e : entrySet) {
//			Map.Entry entry =(Map.Entry)e;//轉型成Map.Entry
			Integer salary= e.getValue();
			sum =sum+salary;
			System.out.printf("name=%s,value=%s%n",e.getKey(),e.getValue());
		}
		System.out.println("sum="+sum);
	}

}
