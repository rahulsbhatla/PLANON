package case5;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

    

public class LeaveInfo extends PermenantEmployee  {
	

	 //private static double noofleaves;
	 private static int d;
	 private static int m;
	 private static int y; 
	

	 //public static double getNoofleaves() {
	//		return noofleaves;
	//	}
	//	public static void setNoofleaves(double noofleaves) {
	//		LeaveInfo.noofleaves = noofleaves;
	//	}
    	public static int getD() {
			return d;
		}
		public static void setD(int d) {
			LeaveInfo.d = d;
		}
		public static int getM() {
			return m;
		}
		public static void setM(int m) {
			LeaveInfo.m = m;
		}
		public static int getY() {
			return y;
		}
		public static void setY(int y) {
			LeaveInfo.y = y;
		}

		
		
			
		public static void getLeaveinfo() {
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			 //System.out.println("No of leaves availed: ");
			// noofleaves=sc.nextInt();
			 System.out.println("Enter your date of joining: ");
			 System.out.println("Enter Date: ");
			 d = sc.nextInt();
			 System.out.println("Enter Month: ");
			 m = sc.nextInt();
			 System.out.println("Enter Year: ");
			 y = sc.nextInt();
			 
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");  
			  LocalDateTime now = LocalDateTime.now();  
			  String month = dtf.format(now);
			  int i=Integer.parseInt(month); 
			  int noofmonths;
			  if(m<i)
			  {
			   noofmonths = i-m;
			  }
			  
			  else
			  {
				   noofmonths = ((12-m)+i);
			  }
			  
			  if(getNoofleaves()>12)
				 {
					 System.out.println("Exceeded number of leaves !!!");
					 System.out.println("Your updated monthly Salary is: ");
					 PerSalaryInfo.getUpdateSalary();
				 }
				 
			  else 
			  {
				if(noofmonths>6 || y!=2021)
				 {
					System.out.println("You can use 2 Leaves this months");
				 }
				 else
				 {
					 System.out.println("You can use only 1 Leaves this months");
				 }
			
			  }
				 
		}
		               
				
		}
			
		




		
		


