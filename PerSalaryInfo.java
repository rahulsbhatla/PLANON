package case5;

import java.util.Scanner;

public class PerSalaryInfo extends PermenantEmployee  {
	
	
	 private static double salary;
	 private static double DA;
	 private static double specialallowance;
	 private static double HRA;
	 private static double GS;
	 private static double result;
	 private static double overtime;
	

		public double getHRA() {
			return HRA;
		}

		public void setHRA(double hRA) {
			HRA = hRA;
		}

		public double getDA() {
			return DA;
		}

		public void setDA(double dA) {
			DA = dA;
		}

		public static double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			PerSalaryInfo.salary = salary;
		}

		public double getGS() {
			return GS;
		}

		public void setGS(double gS) {
			GS = gS;
		}

		public double getResult() {
			return result;
		}

		public void setResult(double result) {
			PerSalaryInfo.result = result;
		}
		
		public double getSpecialallowance() {
			return specialallowance;
		}

		public void setSpecialallowance(double specialallowance) {
			PerSalaryInfo.specialallowance = specialallowance;
		}

		
		public static void getSalaryinfo() {
			
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
	        System.out.println("Enter your monthly salary : ");//taking all the inputs from the user
	        salary= sc.nextDouble();
	        System.out.println("How many hours of overtime you worked this month : ");
	        overtime = sc.nextDouble();
	        specialallowance = overtime*300;
			 DA = 0.1*salary;
			 HRA =0.7*salary; 
			 GS = DA+HRA+salary+specialallowance;
			 System.out.println("\n");
			 System.out.println("Gross salary for this Month : ");
			 System.out.println(GS+"\n");
			 
			 
		}

		public static void getUpdateSalary() {
			
			if(getNoofleaves()>12)
			{
				result=(GS - ((getNoofleaves()-12)*0.02*getSalary()));
				System.out.println(result);
			}
			
			
		}
				

}
