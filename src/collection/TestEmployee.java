package collection;
import java.util.HashSet;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {
		//HashSet比對速度比equals快 ，當set裡有很多物件時，equals就要比對每一次
		//比對HashCode時，比對不一樣時才會執行equals，次數大幅減少
		Set<Employee> set = new HashSet<Employee>();
		Employee e1 =new Employee("001");
		Employee e2 =new Employee("001");

		System.out.println(set.add(e1));
		System.out.println(set.add(e2));
		System.out.println("size="+set.size());
	}

}
