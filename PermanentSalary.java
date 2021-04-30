package employee;

public class PermanentSalary {
	
	public double Amount(int leaves, int month, double totalSalary)

	{

		if (month <= 6 && leaves <= 1) {
			return totalSalary;
		} else if (month >= 6 && month <= 12 && leaves <= 2) {
			return totalSalary;
		} else if (month <= 6 && leaves > 1) {
			return (totalSalary - ((leaves - 1) * 500));
		} else if (month >= 6 && month <= 12 && leaves > 2) {
			return (totalSalary - ((leaves - 2) * 500));

		}
		return totalSalary;
	}

}
