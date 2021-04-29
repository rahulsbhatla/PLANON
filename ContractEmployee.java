package employee;



public class ContractEmployee extends Employee {
	private int noofhours;
	private double totalResult;

	public void setNoofhours(int noofhours) {
		this.noofhours = noofhours;
	}

	public void setTotalResult(double totalResult) {
		this.totalResult = totalResult;
	}

	public int getNoofhours() {
		return noofhours;
	}

	public double getTotalResult() {
		return totalResult;
	}

	ContractEmployee(int id, String name, String type, double salary, String address1, String address2) {
		super(id, name, type, salary, address1, address2);
	}

	
	public double amount(double salary1) {

		return salary1* 500;
	}

	public void display()

	{
System.out.println("Employee ID : " + getId() + "\tName : " + getName() + "\tEmployee type : " + getType() + "\tAddress :" + getAddress1() + " " + getAddress2()); 

	}

	
}
