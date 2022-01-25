package equals;

import java.util.Objects;

public class Employee {
	private String id;

	public Employee(String id) {
		this.id = id;
	}
	
	

	//複寫equals方法時，也必須複寫hashCode方法，如果兩個物件使用equals結果為相等，
	//兩個物件的hashCode必須相等
	@Override
	public boolean equals(Object obj) {
		//因為每一個class都是obj 所以要先避免 先判斷是不是employee型態
		if(obj instanceof Employee) {
			//要轉型 印為obj裡沒有id 要轉成Employee
			Employee emp = (Employee)obj;
			return this.id.equals(emp.id);//借用String equals
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("emp("+this.id+")GC!!!");
	}
//	@Override
//	public String toString() {
//		return String.format("Employee(%s)",id);
//	}
}
