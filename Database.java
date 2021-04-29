package employee;

import java.util.ArrayList;

public class Database {
	private static  Database db;
	static ArrayList<Employee>EmployeeList;

	private Database()
	{
		
	}
	public static Database getInstance() {
		if(db==null)
			db=new Database();
		return db;
		
	}

	
	public static void addEmployee(Employee e)
	{
		if(EmployeeList==null)
			EmployeeList=new ArrayList<Employee>();
		EmployeeList.add(e);
	}
	
	
	public void data()
	{
		
		PermanentEmployee e1=new PermanentEmployee(001,"Rahul","permanent",20000,"Flat no:202 Phase:1","Modern Towers",12,03,2020);
		addEmployee(e1);
		PermanentEmployee e2=new PermanentEmployee(002,"Nitin","permanent",30000,"Flat no:506 Phase:2","Rohit Towers",12,02,2020);
		addEmployee(e2);
		PermanentEmployee e3=new PermanentEmployee(003,"Soumya","permanent",40000,"Flat no:106 Phase:A","Sea Towers",12,04,2020);
		addEmployee(e3);
		PermanentEmployee e4=new PermanentEmployee(004,"Raj","permanent",50000,"Flat no:1302 Phase:J","Lake Towers",12,05,2020);
		addEmployee(e4);
		ContractEmployee c1=new ContractEmployee(005,"kapil","contract",200,"Flat no:606 Phase:J","Lake Towers",12,06,2020);
		addEmployee(c1);
		ContractEmployee c2=new ContractEmployee(006,"Ravi","contract",300,"Flat no:1905 Phase:1","sky Towers",12,07,2020);
		addEmployee(c2);
		ContractEmployee c3=new ContractEmployee(007,"Prabhat","contract",350,"Flat no:302 Phase:p","Water Towers",12,12,2020);
		addEmployee(c3);
		
	}
	
	public boolean isPresent(int eid)
	{
		for(Employee e:EmployeeList)
		{
			if(e.getId()==eid)
				return true;
		}
		return false;
	}
	public Employee printEmployeeDetails(int eid)
	{
		for(Employee e:EmployeeList)
		{
			if(e.getId()==eid)
			{
				e.display();
				return e;
			}
				
		}
		return null;
	}
	
}
	
	
