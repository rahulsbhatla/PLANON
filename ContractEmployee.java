package employee;

public class ContractEmployee extends Employee implements IEmployee {
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

	ContractEmployee(int id, String name, String type, Address address, Date date) {
		super(id, name, type,address, date);
	}

	public void display()

	{
		
		 System.out.println("Employee ID : " + getId());
			System.out.println("Name : " + getName());
			System.out.println("Employee type : " + getType());
			System.out.println("Address : ");
			this.EmployeeAddressdetails();
			System.out.println("Date of joining : ");
			this.EmployeeDatedetails();
		

			

	}

}
