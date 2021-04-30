package employee;

public class PermanentEmployee extends Employee {

	private int noofleaves;
	private double totalSalary;

	PermanentEmployee(int id, String name, String type, Salary salary, Address address, Date date) {
		super(id, name, type, salary, address, date);

		this.noofleaves = noofleaves;
		this.totalSalary = totalSalary;
	}

	public void setNoofleaves(int noofleaves) {
		this.noofleaves = noofleaves;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public int getNoofleaves() {
		return noofleaves;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void display()

	{

		System.out.println("Employee ID : " + getId());
		System.out.println("Name : " + getName());
		System.out.println("Salary : ");
		this.EmployeeSalarydetails();
		System.out.println("Employee type : " + getType());
		System.out.println("Address : ");
		this.EmployeeAddressdetails();
		System.out.println("Date of joining : ");
		this.EmployeeDatedetails();
		this.totalSalary = this.getSalary().getBasic() + this.getSalary().getHra() + this.getSalary().getDa();

		System.out.println("Total Salary: " + this.totalSalary);

	}

}
