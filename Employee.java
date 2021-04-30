package employee;

public class Employee implements IEmployee {

	private int id;
	private String name;
	private String type;
	private Salary salary;
	private Address address;
	private Date date;
	public double totalSalary;

	Employee(int id, String name, String type, Salary salary, Address address, Date date) {
		this.name = name;
		this.type = type;
		this.id = id;
		this.setAddress(address);
		this.setSalary(salary);
		this.setDate(date);

	}
	Employee(int id, String name, String type, Address address, Date date)
	{
		this.name = name;
		this.type = type;
		this.id = id;
		this.setAddress(address);
		this.setDate(date);
	}

	Employee(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void display() {
		System.out.println(
				"Employee ID : " + getId() + " Employee Name : " + getName() + " Employee type : " + getType());
	}

	public void EmployeeAddressdetails() {
		this.address.Addressdetails();
	}

	public void EmployeeSalarydetails() {
		this.salary.Salarydetails();
	}

	public void EmployeeDatedetails() {
		this.date.Datedetails();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

}
