package employee;

public class Address 
{
	private String houseno;
	private String area;
	private int pinCode;
	Address(String houseno ,String area,int pinCode)
	{
		this.houseno=houseno;
		this.area=area;
		this.pinCode=pinCode;
	}
	
	
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	public String getHouseno() {
		return houseno;
	}


	public String getArea() {
		return area;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void Addressdetails() {
		
		System.out.println("House No : "+this. getHouseno());
		System.out.println("Area Name : "+this.getArea());
		System.out.println("PinCode   : "+this.getPinCode());
		
	}


}
