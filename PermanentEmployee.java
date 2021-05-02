package employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PermanentEmployee extends Employee implements IEmployee {

	private int noofleaves;
	private double totalSalary;
	private double specialallowance;
	double sum = 0;
	

	public double getSum() {
		return sum;
	}


	public void setSum(double sum) {
		this.sum = sum;
	}


	PermanentEmployee(int id, String name, String type, Salary salary, Address address, Date date,Leave leave) {
		super(id, name, type, salary, address, date,leave);

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
		System.out.println("No of Leaves in this year : ");
		this.EmployeeLeavedetails();
		System.out.println("Have you worked any extra hours this month: ");
		specialallowance= sc.nextDouble();
		this.totalSalary = this.getSalary().getBasic() + this.getSalary().getHra() + this.getSalary().getDa()+specialallowance*500;

		System.out.println("Total Salary: " + this.totalSalary);
		

	}
	public void display1()

	{
           
           int noofleaves;
           Scanner sc= new Scanner(System.in);
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");
   		LocalDateTime now = LocalDateTime.now();
   		String month1 = dtf.format(now);
   		int m = Integer.parseInt(month1);
   		Leavesmonthly l1 = new Leavesmonthly();
		System.out.println("Employee type : " + getType());
		this.totalSalary = this.getSalary().getBasic() + this.getSalary().getHra() + this.getSalary().getDa()+specialallowance*500;
		//System.out.println("Enter number of leaves taken till current month: ");
		//noofleaves = sc.nextInt();
		int salaryafterleaves = 0;
		
		
		for(int i=1;i<=m;i++)
		{
			if(getType().equalsIgnoreCase("permanent"))
			{
				for(i=1;i<=m;i++)
					
				{
				sum = sum+this.totalSalary;
				}
				
			}
		}

		
        }

	public double getSpecialallowance() {
		return specialallowance;
	}

	public void setSpecialallowance(double specialallowance) {
		this.specialallowance = specialallowance;
	}
public void display2()
{
	System.out.println(" Name : " + getName());
	System.out.println("Salaries :");
	this.totalSalary = this.getSalary().getBasic() + this.getSalary().getHra() + this.getSalary().getDa();
	System.out.println(totalSalary);
	System.out.println("\n");
}
}
