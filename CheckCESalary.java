package employee;

public class CheckCESalary {
		Employee e;
		int month,leaves;
		private double salary1;
		CheckCESalary(ContractEmployee e,double salary1)
		{
			this.e=e;
			this.salary1=salary1;
			
			System.out.println("Amount to be paid is : "+e.amount(salary1));
		}
}

