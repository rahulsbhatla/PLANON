package employee;

public class CheckPESalary {
	PermanentEmployee e;
	int noOfLEaves,month;
	CheckPESalary(PermanentEmployee current,int noOfLEaves,int month)
	{
		this.e=current;
		this.noOfLEaves=noOfLEaves;
		this.month=month;
	System.out.println("Original Salary Is "+current.getSalary()+"\nSalary after Deduction is : "+e.Amount(noOfLEaves,month));
	
		
	}
	
}

