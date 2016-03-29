package encapsulation;

public class EmployeeDatabase {

	public static void main (String [] agrs){
		
		//imran
		employees e1=new employees();
		e1.setName("Imran");
		e1.setemployeeID(302958);
		e1.setssn("00000000");
		
		// someone else
		employees e2=new employees();
		e2.setName("Rahim");
		e2.setemployeeID(3029786);
		e2.setssn("00000000");
		
		
		System.out.println(e1.getName() + " and "+ e2.getName() +" are working in the smae company");
		
		
	}
	
	
}
