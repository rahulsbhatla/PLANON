package employee;

public class Date {

	private int d;
	private int m;
	private int y;

	Date(int m) {
		this.m = m;

	}

	Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public int getD() {
		return d;
	}

	public int getM() {
		return m;
	}

	public int getY() {
		return y;
	}

	public void setD(int d) {
		this.d = d;
	}

	public void setM(int m) {
		this.m = m;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void Datedetails() {

		System.out.println("Day : " + this.getD());
		System.out.println("Month : " + this.getM());
		System.out.println("Year  : " + this.getY());

	}

}
