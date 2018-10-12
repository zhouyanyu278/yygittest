package suanfa;

public class Ackerman {
	public double ackerman(double n,double m)
	{
		if(n==1&&m==0)
		{
			return 2;
		}
		if(n==0&&m>=0)
		{
			return 1;
		}
		if(n>=2&&m==0)
		{
			return n+2;
		}
		if(n>=1&&m>=1)
		{
			
			return ackerman(ackerman(n-1,m),m-1);
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		Ackerman a=new Ackerman();
		System.out.println(a.ackerman(15,2));
		// TODO Auto-generated method stub
		
	}

}
