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

	public void data() {
		Address address1 = new Address("houseno:202", "Vidyanagar", 500044);
		Date date1 = new Date(12, 03, 2020);
		Salary salary1 = new Salary(20000, 300, 400);
		PermanentEmployee e1 = new PermanentEmployee(001, "Rahul", "permanent", salary1, address1, date1);
		addEmployee(e1);
		Address address2 = new Address("houseno:1202", "Ramnagar", 500044);
		Date date2 = new Date(11, 04, 2020);
		Salary salary2 = new Salary(20000, 300, 400);
		PermanentEmployee e2 = new PermanentEmployee(002, "Nitin", "permanent", salary2, address2, date2);
		addEmployee(e2);
		Address address3 = new Address("houseno:302", "Balnagar", 500044);
		Date date3 = new Date(14, 02, 2020);
		Salary salary3 = new Salary(20000, 300, 400);
		PermanentEmployee e3 = new PermanentEmployee(003, "Soumya", "permanent", salary3, address3, date3);
		addEmployee(e3);
		Address address4 = new Address("houseno:209", "LBnagar", 500044);
		Date date4 = new Date(01, 8, 2020);
		Salary salary4 = new Salary(20000, 300, 400);
		PermanentEmployee e4 = new PermanentEmployee(004, "Raj", "permanent", salary4, address4, date4);
		addEmployee(e4);
		Address address5 = new Address("houseno:502", "Saroornagar", 500044);
		Date date5 = new Date(05, 9, 2020);
		Salary salary5 = new Salary(20000, 300, 400);
		ContractEmployee c1 = new ContractEmployee(005, "kapil", "contract", salary5, address5, date5);
		addEmployee(c1);
		Address address6 = new Address("houseno:606", "Himayatnagar", 500044);
		Date date6 = new Date(28, 10, 2020);
		Salary salary6 = new Salary(20000, 300, 400);
		ContractEmployee c2 = new ContractEmployee(006, "Ravi", "contract", salary6, address6, date6);
		addEmployee(c2);
		Address address7 = new Address("houseno:2202", "Gandhinagar", 500044);
		Date date7 = new Date(31, 03, 2021);
		Salary salary7 = new Salary(20000, 300, 400);
		ContractEmployee c3 = new ContractEmployee(007, "Prabhat", "contract", salary7, address7, date7);
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

}
