package employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ContractEmployee extends Employee implements IEmployee {
	private int noofdays;
	private double totalResult;

	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}

	public void setTotalResult(double totalResult) {
		this.totalResult = totalResult;
	}

	public int getNoofdays() {
		return noofdays;
	}

	public double getTotalResult() {
		return totalResult;
	}

	ContractEmployee(int id, String name, String type, Address address, Date date,Leave leave) {
		super(id, name, type,address, date,leave);
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
			System.out.println("Date of joining : ");
			this.EmployeeDatedetails();
		

			

	}
	public void display1()

	{
		Scanner sc = new Scanner(System.in);
		 double sum = 0;
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");
 		LocalDateTime now = LocalDateTime.now();
 		String month1 = dtf.format(now);
 		int m = Integer.parseInt(month1);
		System.out.println("Employee type : " + getType());
		System.out.println("Enter Number of days you work per Month: ");
		noofdays = sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			if(getType().equalsIgnoreCase("contract"))
			{
				sum = sum+(noofdays)*(8*200);
				
				


			}
			
			
		

			

	}
		System.out.println("Total salary paid until now to "+getName() +" is "+sum );

	}
}
