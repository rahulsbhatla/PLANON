package employee;

public class Employee {
	  
	private int id;
	private String name;
	private String type;
	private double salary;
	private String address1;
	private String address2;
	

	Employee(int id,String name,String type,double salary, String address1,String address2)
	{
		this.name=name;
		this.type=type;
		this.id=id;
		this.address1=address1;
		this.address2=address2;
		this.salary=salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getSalary() {
		return salary;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}
	
	public void display()
	{
		System.out.println("Employee ID : "+getId()+" Employee Name : "+getName()+" Employee type : "+getType());
	}

}
