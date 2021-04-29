package employee;

public class SalaryType {
	private int leaves,month;
	private Employee e;
	private double salary1;
	
	SalaryType(Employee e,int leaves,int month)
	{
		this.e=e;
		this.leaves=leaves;
		this.month=month;
		checkSalary();
	}
	private void checkSalary() {
			CheckPESalary cp=new CheckPESalary((PermanentEmployee) e,leaves,month);
			
	}
	SalaryType(Employee e,double salary1)
	{
		this.e=e;
		this.salary1=salary1;
		
		checkSalary1();
	}
	private void checkSalary1() {
		

		CheckCESalary ca=new CheckCESalary((ContractEmployee)e,salary1);
		
		
	}
		
	}

