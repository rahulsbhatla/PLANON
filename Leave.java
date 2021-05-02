package employee;

public class Leave {
	private int jan;
	private int feb;
	private int march;
	private int april;
	private int may;
	private int june;
	private int july;
	private int august;
	private int september;
	private int october;
	private int november;
	private int december;
	
	Leave(int jan,int feb,int march,int april,int may,int june,int july,int august,int september,int october,int november,int december)
	{
		this.jan=jan;
		this.feb=feb;
		this.march=march;
		this.april=april;
		this.may=may;
		this.june=june;
		this.july=july;
		this.august=august;
		this.september=september;
		this.october=october;
		this.november=november;
		this.december=december;
		
	}
	
	
	
	public void setJan(int jan) {
		this.jan = jan;
	}
	public void setFeb(int feb) {
		this.feb = feb;
	}
	public void setMarch(int march) {
		this.march = march;
	}
	public void setApril(int april) {
		this.april = april;
	}
	public void setMay(int may) {
		this.may = may;
	}
	public void setJune(int june) {
		this.june = june;
	}
	public void setJuly(int july) {
		this.july = july;
	}
	public void setAugust(int august) {
		this.august = august;
	}
	public void setSeptember(int september) {
		this.september = september;
	}
	public void setOctober(int october) {
		this.october = october;
	}
	public void setNovember(int november) {
		this.november = november;
	}
	public void setDecember(int december) {
		this.december = december;
	}
	public int getJan() {
		return jan;
	}
	public int getFeb() {
		return feb;
	}
	public int getMarch() {
		return march;
	}
	public int getApril() {
		return april;
	}
	public int getMay() {
		return may;
	}
	public int getJune() {
		return june;
	}
	public int getJuly() {
		return july;
	}
	public int getAugust() {
		return august;
	}
	public int getSeptember() {
		return september;
	}
	public int getOctober() {
		return october;
	}
	public int getNovember() {
		return november;
	}
	public int getDecember() {
		return december;
	}
public void Leavedetails() {
		
		System.out.println("Leaves in Jan : "+this. getJan());
		
		System.out.println("Leaves in Feb : "+this.getFeb());
		
		System.out.println("Leaves in March  : "+this.getMarch());

		System.out.println("Leaves in April : "+this. getApril());

		System.out.println("Leaves in May : "+this. getMay());

		System.out.println("Leaves in June : "+this. getJune());

		System.out.println("Leaves in July : "+this. getJuly());

		System.out.println("Leaves in August : "+this. getAugust());

		System.out.println("Leaves in September : "+this. getSeptember());
		
		System.out.println("Leaves in October : "+this. getOctober());
		
		System.out.println("Leaves in November : "+this. getNovember());
		
		System.out.println("Leaves in December : "+this. getDecember());
		
		
	}


}
