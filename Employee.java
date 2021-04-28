package case5;

import java.util.Scanner;

public class Employee {

	private static int emp_id; 
	private static String name;
	private static char type;
	private static int noofleaves;
	
	public void setEmp_id(int emp_id) {
		Employee.emp_id = emp_id;
	}
	
	public void setName(String name) {
		Employee.name = name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	
	public String getName() {
		return name;
	}
	public char getType() {
		return type;
	}

	public void setType(char type) {
		Employee.type = type;
	}
	
	public static int getNoofleaves() {
		return noofleaves;
	}

	public void setNoofleaves(int noofleaves) {
		Employee.noofleaves = noofleaves;
	}


	public static void detail() throws Exception 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee id: ");
		emp_id = sc.nextInt();
		System.out.println("Employee name: ");
		name = sc.next();
		System.out.println("Employee Type: P or C ");
		type = sc.next().charAt(0);
		if(type=='P' || type =='p')
		{
			System.out.println("Number of Leaves Applied: ");
			noofleaves = sc.nextInt();
			PermenantEmployee.read();
		}
		else if(type=='C' || type =='c')
		{
			CustomEmployement.read();
			System.exit(0);
		}
		else
		{
			throw new Exception("Choose correct Employee Type");
		}
		
		
	}

	
	
	
		
		
	}
	
	
	
	
