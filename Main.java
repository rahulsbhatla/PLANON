package employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/**
		 * @author 91893 Retrieving an instance of our database using getInstance()
		 *         db.data() will store all the data of Employees
		 * 
		 * 
		 * 
		 */
		Database db = Database.getInstance();
		db.data();

		System.out.println(db);
		salaries(db, in);

	}

	/**
	 * {@link salaries} to print the Employee details if Id matches else return
	 * error <br>
	 * Employee current will print the Details of current Employee <br>
	 * String type is used to get the current Employee type If type is Permenant.
	 * Print Salary using PermanentSalary class If type is Contract. print Salary
	 * using ContractSalary class
	 * 
	 * @param db
	 * @param in
	 * 
	 * 
	 * 
	 */
	public static void salaries(Database db, Scanner in) {
		System.out.println("Welcome to planon");
		System.out.println("1-Total salary paid to an employee upto current month");
		System.out.println("2-Check the Amount of salary to be paid to an Employee");
		System.out.println("3-How many leaves Employee took upto a month");
		System.out.println("4-Total salary paid upto an entered month");
		System.out.println("5-Print all Employee");
		
		System.out.println("6-Exit");
		
		int choice=in.nextInt();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");
		LocalDateTime now = LocalDateTime.now();
		String month1 = dtf.format(now);
		int i = Integer.parseInt(month1);
		
		switch(choice)
		{
		case 1:
			int eid2 = checkingID(db, in);
			  Employee current2 = db.printEmployeeDetails1(eid2);
			 String type2 = current2.getType();
			if (current2.getType() == "permanent")
			{
			 Leavesmonthly l1 = new Leavesmonthly();
			 
			 int salaryafterleaves = 0;
			 for(int m=1;m<=i;m++)
			 {
			 if(current2.getType().equalsIgnoreCase("permanent"))
						for( m=1;m<=i;m++)
							
						{
							l1.checkmonthly1(m,current2);
						salaryafterleaves = salaryafterleaves + l1.getX1();
						 
						}
			 }
						System.out.println(salaryafterleaves);
						if(i<7)
						{
							salaryafterleaves = (salaryafterleaves-i);
						}
						else
						{
							salaryafterleaves = (salaryafterleaves-6-((i-6)*2));
						}
						double sum2 = current2.getTotalSalary()*i-(salaryafterleaves*500);
						System.out.println("Total salary paid after leaves to "+current2.getName() +" is "+sum2 );
			}
			
			 
			break;
		case 2:
			int eid1 = checkingID(db, in);
			  Employee current = db.printEmployeeDetails(eid1);
			 String type = current.getType();

		if (type == "permanent") {
			Date date = current.getDate();
			int m = date.getM();
			System.out.println("Enter the month to know your salary: ");
			int m1 = in.nextInt();
			Leavesmonthly l = new Leavesmonthly();
			l.checkmonthly(m1,current);
			int x = l.getX();
			
			if(m>15)
			{
				System.out.println("Used all the Leaves allotted to you this year");
				System.exit(0);
			}
			
			if (i > m1) {
				int month = i - m1;
				PermanentSalary p = new PermanentSalary();

				System.out.println("Original Salary Is " + current.getTotalSalary() + "\nSalary after Deduction is : "
						+ p.Amount(x, month, current.getTotalSalary()));
				System.out.println(current);

			} else {

				int month = (12 - m1) + i;
				PermanentSalary p = new PermanentSalary();

				System.out.println("Original Salary Is " + current.getTotalSalary() + "\nSalary after Deduction is : "
						+ p.Amount(x, month, current.getTotalSalary()));

			}

		} else {
			System.out.print("Enter the no of hours: ");
			double salary1 = in.nextDouble();
			ContractSalary c = new ContractSalary();
			System.out.println("Amount to be Paid: " + c.amount(salary1));
		}
		break;
		
		case 3:
			int eid3 = checkingID(db, in);
			  Employee current3 = db.printEmployeeDetails1(eid3);
			Leavesmonthly l3 = new Leavesmonthly();
			System.out.println("Enter to know how many leaves you have taken until this month: ");
			int m2 = in.nextInt();
	        int leavesuptonow =0; 
			for( int m3=1;m3<=m2;m3++)
				
			{
				l3.checkmonthly1(m3, current3);
				
				leavesuptonow = leavesuptonow+ l3.getX1();
			}
			System.out.println(leavesuptonow);
			break;
			
	    case 4:
	    	
	    	int eid4 = checkingID(db, in);
			  Employee current4 = db.printEmployeeDetails1(eid4);
			  System.out.println("Enter a month to know salary until that: ");
			  int m4 = in.nextInt();
			if (current4.getType() == "permanent")
			{
			 Leavesmonthly l4 = new Leavesmonthly();
			 
			 int salaryafterleaves = 0;
			 for(int m=1;m<=m4;m++)
			 {
			 if(current4.getType().equalsIgnoreCase("permanent"))
						for( m=1;m<=m4;m++)
							
						{
							l4.checkmonthly1(m,current4);
						salaryafterleaves = salaryafterleaves + l4.getX1();
						 
						}
			 }
						
						System.out.println("You have taken: "+salaryafterleaves+"Leaves");
						if(m4<7)
						{
							salaryafterleaves = (salaryafterleaves-i);
						}
						else
						{
							salaryafterleaves = (salaryafterleaves-6-((m4-6)*2));
						}
						double sum2 = current4.getTotalSalary()*m4-(salaryafterleaves*500);
						System.out.println("Total salary paid after deducting exra leaves until now is  "+current4.getName() +" is "+sum2 );
			}
			 
			break;
			
	    case 5:
	    	db.printEmployeeslist();
	    	break;
	    	
		case 6:
			System.out.println("You have exited Sucessfully");
			System.exit(0);
			
		default:
			System.out.println("Wrong Input Check again!!!");
			System.exit(0);
		}
		}

	public static int checkingID(Database db, Scanner in) {
		System.out.print("Enter the Employee ID : ");
		int i = in.nextInt();
		if (db.isPresent(i))
			return i;

		else {

			System.out.print("The ID entered does not exist in our DatBase");
		}

		return 0;

	}

}