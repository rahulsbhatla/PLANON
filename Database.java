package employee;

import java.util.ArrayList;

public class Database {
	private static Database db;
	static ArrayList<Employee> EmployeeList;

	private Database() {

	}

	public static Database getInstance() {
		if (db == null)
			db = new Database();
		return db;

	}

	public static void addEmployee(Employee e) {
		if (EmployeeList == null)
			EmployeeList = new ArrayList<Employee>();
		EmployeeList.add(e);
	}

	/**
	 * 
	 */
	public void data() {
		Address address1 = new Address("houseno:202", "Vidyanagar", 500044);
		Date date1 = new Date(12, 03, 2020);
		Salary salary1 = new Salary(20000, 300, 400);
		Leave leave1 = new Leave(1,1,2,1,1,3,4,1,1,1,1,1);
		PermanentEmployee e1 = new PermanentEmployee(001, "Rahul", "permanent", salary1, address1, date1,leave1);
		addEmployee(e1);
		Address address2 = new Address("houseno:1202", "Ramnagar", 500044);
		Date date2 = new Date(11, 04, 2020);
		Salary salary2 = new Salary(30000, 300, 400);
		Leave leave2 = new Leave(1,2,2,2,2,2,4,2,2,5,5,5);
		PermanentEmployee e2 = new PermanentEmployee(002, "Nitin", "permanent", salary2, address2, date2,leave2);
		addEmployee(e2);
		Address address3 = new Address("houseno:302", "Balnagar", 500044);
		Date date3 = new Date(14, 02, 2020);
		Salary salary3 = new Salary(40000, 300, 400);
		Leave leave3 = new Leave(1,2,2,2,1,1,4,1,1,1,1,1);
		PermanentEmployee e3 = new PermanentEmployee(003, "Soumya", "permanent", salary3, address3, date3,leave3);
		addEmployee(e3);
		Address address4 = new Address("houseno:209", "LBnagar", 500044);
		Date date4 = new Date(01, 8, 2020);
		Salary salary4 = new Salary(50000, 300, 400);
		Leave leave4 = new Leave(0,4,2,2,1,3,4,1,1,1,1,1);
		PermanentEmployee e4 = new PermanentEmployee(004, "Raj", "permanent", salary4, address4, date4,leave4);
		addEmployee(e4);
		Address address5 = new Address("houseno:502", "Saroornagar", 500044);
		Date date5 = new Date(05, 9, 2020);
		Leave leave5 = new Leave(3,1,2,1,1,3,4,1,1,1,1,1);
		
		ContractEmployee c1 = new ContractEmployee(005, "kapil", "contract", address5, date5,leave5);
		addEmployee(c1);
		Address address6 = new Address("houseno:606", "Himayatnagar", 500044);
		Date date6 = new Date(28, 10, 2020);
		Leave leave6 = new Leave(1,1,2,1,1,3,4,1,1,1,1,1);
		
		ContractEmployee c2 = new ContractEmployee(006, "Ravi", "contract", address6, date6,leave6);
		addEmployee(c2);
		Address address7 = new Address("houseno:2202", "Gandhinagar", 500044);
		Date date7 = new Date(31, 03, 2021);
		Leave leave7 = new Leave(1,1,2,1,1,3,4,1,1,1,1,1);
	
		ContractEmployee c3 = new ContractEmployee(007, "Prabhat", "contract", address7, date7,leave7);
		addEmployee(c3);

	}

	public boolean isPresent(int eid) {
		for (Employee e : EmployeeList) {
			if (e.getId() == eid)
				return true;
		}
		return false;
	}

	public Employee printEmployeeDetails(int eid) {
		for (Employee e : EmployeeList) {
			if (e.getId() == eid) {
				e.display();
				return e;
			}

		}
		return null;
	}
	public Employee printEmployeeDetails1(int eid) {
		for (Employee e : EmployeeList) {
			if (e.getId() == eid) {
				e.display1();
				return e;
			}

		}
		return null;
	}

	public void printEmployeeslist() {
		for (Employee x : EmployeeList) 
		{
		x.display3();
		}
	}

}
