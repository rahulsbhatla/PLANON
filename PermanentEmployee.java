package employee;

public class PermanentEmployee extends Employee {

	private int noofleaves;
	private double totalSalary;
	private double DA;
	private double HRA;
	private double GS;

	PermanentEmployee(int id, String name, String type, double salary, String address1, String address2) {
		super(id, name, type, salary, address1, address2);

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

	public double Amount(int leaves, int month) {
		if (month <= 6 && leaves <= 1) {
			return this.getSalary();
		} else if (month >= 6 && month<=12 && leaves <= 2) {
			return this.getSalary();
		} else if (month <= 6 && leaves > 1) {
			return (this.getSalary() - ((leaves - 1) * 500));
		} else if (month >= 6 &&  month<=12 && leaves > 2) {
			return (this.getSalary() - ((leaves - 2) * 500));
		}
		return 0;
	}

	public void display()

	{

		System.out.println("Employee ID : " + getId() + "\tName : " + getName() + "\tSalary : " + getSalary()
				+ "\tEmployee type : " + getType() + "\tAddress :" + getAddress1() +" " + getAddress2());

	}

}
