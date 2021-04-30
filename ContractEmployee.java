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

	ContractEmployee(int id, String name, String type, Salary salary, Address address, Date date) {
		super(id, name, type, salary, address, date);
	}

	public void display()

	{
		System.out.println("Employee ID : " + getId() + "\tName : " + getName() + "\tEmployee type : " + getType()
				+ "\tAddress :" + getAddress() + "\tDate of Joining : " + getDate());

	}

}
