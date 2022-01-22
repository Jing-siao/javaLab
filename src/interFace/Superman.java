package interFace;
//Superman Lawyer 型態
public class Superman implements Lawyer,Account{

	@Override
	public void litigation() {};
	@Override
	public void declare() {};
	public static void main(String[] args) {
		
		Superman s= new Superman();
		s.litigation();
		s.declare();

	}


	

}
