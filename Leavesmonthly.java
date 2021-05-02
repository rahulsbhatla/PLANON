package employee;

public class Leavesmonthly {

	int x = 0;
	int x1 =0;
	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void checkmonthly(int m1,Employee current ) {
		// TODO Auto-generated method stub
		
		if(m1==1)
		{
			 x = current.getLeave().getJan();
		}
		else if(m1==2)
		{
			 x = current.getLeave().getFeb();
		}
		else if(m1==3)
		{
			 x = current.getLeave().getMarch();
		}
		else if(m1==4)
		{
			 x = current.getLeave().getApril();
		}
		else if(m1==5)
		{
			 x = current.getLeave().getMay();
		}
		else if(m1==6)
		{
			 x = current.getLeave().getJune();
		}
		else if(m1==7)
		{
			 x = current.getLeave().getJuly();
		}
		else if(m1==8)
		{
			 x = current.getLeave().getAugust();
		}
		else if(m1==9)
		{
			 x = current.getLeave().getSeptember();
		}
		else if(m1==10)
		{
			 x = current.getLeave().getOctober();
		}
		else if(m1==11)
		{
			 x = current.getLeave().getNovember();
		}
		else if(m1==12)
		{
			 x = current.getLeave().getDecember();
		}
		if(x==1)
		{
		System.out.println("You have taken "+ x + " Leave");
		}
		else
		{
			System.out.println("You have taken "+ x + " Leaves");
		}
	}
	public void checkmonthly1(int m,Employee current)
	{
		if(m==1)
		{
			 x1 = current.getLeave().getJan();
		}
		else if(m==2)
		{
			 x1 = current.getLeave().getFeb();
		}
		else if(m==3)
		{
			 x1 = current.getLeave().getMarch();
		}
		else if(m==4)
		{
			 x1= current.getLeave().getApril();
		}
		else if(m==5)
		{
			 x1 = current.getLeave().getMay();
		}
		else if(m==6)
		{
			 x1 = current.getLeave().getJune();
		}
		else if(m==7)
		{
			 x1 = current.getLeave().getJuly();
		}
		else if(m==8)
		{
			 x1 = current.getLeave().getAugust();
		}
		else if(m==9)
		{
			 x1 = current.getLeave().getSeptember();
		}
		else if(m==10)
		{
			 x1 = current.getLeave().getOctober();
		}
		else if(m==11)
		{
			 x1 = current.getLeave().getNovember();
		}
		else if(m==12)
		{
			 x1 = current.getLeave().getDecember();
		}
	}

}
