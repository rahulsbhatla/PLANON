package case5;

import java.util.Scanner;

public class CusSalaryInfo extends CustomEmployement {

	static double noofhours;
	static double result;
	
	
	public static void setNoofhours(double noofhours) {
		CusSalaryInfo.noofhours = noofhours;
	}
	public static void setResult(double result) {
		CusSalaryInfo.result = result;
	}
	public static double getNoofhours() {
		return noofhours;
	}
	public static double getResult() {
		return result;
	}
	
	public static void getSalaryinfo() {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of hours worked in this month: ");//taking all the inputs from the user
        noofhours= sc.nextDouble();
		 result = noofhours*500;
		 System.out.println("Total salary for this Month : ");
		 System.out.println(result+"\n");
		 
		 
	}
		
	}


