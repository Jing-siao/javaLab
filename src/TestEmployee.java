
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.empno = 1 ;
		emp.name = "Jing";
		System.out.println("員工編號:" + emp.empno + ",員工名稱:" + emp.name);
		
		Employee emp2 = new Employee();
		emp2.empno = 2 ;
		emp2.name = "Mary";
		System.out.println("員工編號:" + emp2.empno + ",員工名稱:" + emp2.name);
		
		System.out.println(emp == emp2);//emp 跟emp2存放記憶體位址不同
		emp2 = emp;//emp2指向第一次產生的emp物件
		System.out.println("員工編號:" + emp2.empno + ",員工名稱:" + emp2.name);
		System.out.println(emp == emp2);
		
		emp = null;
		emp2 = null;
		//物件變數如果是null，表示沒有指向任何物件，會發生NullPointException,程式會中斷
		System.out.println(emp.empno);
		System.out.println("done");

	}

}
//stack區 堆疊區 一般區域變數存放位置
//Heap區 new物件存放記憶體位址
