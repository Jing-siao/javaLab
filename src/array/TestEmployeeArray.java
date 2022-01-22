package array;


public class TestEmployeeArray {

	public static void main(String[] args) {
		Employee[] emps =  new Employee[2];
		emps[0] =  new Employee();
		emps[0].empno = 1;
		emps[0].name = "Jing";
		System.out.println(emps[0].name);
		
		Employee emp2 =  new Employee();
		emp2.empno = 2;
		emp2.name = "David";
		emps[1]=emp2;
		for (int i = 0; i<emps.length; i++) {
			System.out.printf("員工編號:%d,姓名:%s%n",emps[i].empno,emps[i].name);
			
		}
	}

}
