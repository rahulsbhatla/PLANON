package employee;

public class Salary {

	private double basic;
	private double hra;
	private double da;

	Salary(double basic, double hra, double da) {
		this.basic = basic;
		this.hra = hra;
		this.da = da;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getBasic() {
		return basic;
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public void Salarydetails() {

		System.out.println("Basic : " + this.getBasic());
		System.out.println("HRA : " + this.getHra());
		System.out.println("DA   : " + this.getDa());

	}

}
