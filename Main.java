package employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Database db = Database.getInstance();
		db.data();
		System.out.println("Welcome");
		System.out.println(db);
		salaries(db, in);

	}

	public static void salaries(Database db, Scanner in) {

		int eid1 = checkingID(db, in);
		Employee current = db.printEmployeeDetails(eid1);
		String type = current.getType();
		System.out.println(type);

		if (type == "permanent")
		{
			System.out.println("Enter the number of leaves taken : ");
			int noOfLeaves = in.nextInt();
			//System.out.println("Enter the month : ");
			//int month = in.nextInt();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");  
			  LocalDateTime now = LocalDateTime.now();  
			  String month1 = dtf.format(now);
			  int i=Integer.parseInt(month1);
			  int m = current.getM();
			  if(i>m)
			  {
			  int month = i-m;
			  System.out.println(month);
			  SalaryType ss = new SalaryType(current, noOfLeaves, month);
			  }
			  else
			  {
			  
				  int month = (12-m)+i;
				  SalaryType ss = new SalaryType(current, noOfLeaves, month);
			  }
			 
		} else {
			System.out.print("Enter the no of hours: ");
			double salary1 = in.nextDouble();
			SalaryType ss1 = new SalaryType(current, salary1);
		}

	}

	public static int checkingID(Database db, Scanner in) {
		System.out.print("Enter the Employee ID : ");
		int i = in.nextInt();
		if (db.isPresent(i))
			return i;
		
		else 
		{
			
			System.out.print("The ID entered does not exist in our DatBase");
		}
		
		return 0;

	}

}