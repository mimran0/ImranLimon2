package encapsulation;

public class employees {

    private String name;
	private int employeeID;
	private String ssn;
	
	String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	
	public String getssn(){
		return ssn;
	}
	public void setssn(String ssn){
		this.ssn=ssn;
	}
	
	
	public int getemployeeID(){
		return employeeID;
	}
	public void setemployeeID(int employeeID){
		this.employeeID=employeeID;
	}
	
	
}
