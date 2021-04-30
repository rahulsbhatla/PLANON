package employee;

import java.util.Scanner;

public class PermanentEmployee extends Employee {

	private int noofleaves;
	private double totalSalary;
	private double specialallowance;

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
           Scanner sc=new Scanner(System.in);
           System.out.println("Employee ID : " + getId());
		System.out.println("Name : " + getName());
		System.out.println("Salary : ");
		this.EmployeeSalarydetails();
		System.out.println("Employee type : " + getType());
		System.out.println("Address : ");
		this.EmployeeAddressdetails();
		System.out.println("Date of joining : ");
		this.EmployeeDatedetails();
		System.out.println("Have you worked any extra hours this month: ");
		specialallowance= sc.nextDouble();
		this.totalSalary = this.getSalary().getBasic() + this.getSalary().getHra() + this.getSalary().getDa()+specialallowance*500;

		System.out.println("Total Salary: " + this.totalSalary);
		

	}

	public double getSpecialallowance() {
		return specialallowance;
	}

	public void setSpecialallowance(double specialallowance) {
		this.specialallowance = specialallowance;
	}

}
