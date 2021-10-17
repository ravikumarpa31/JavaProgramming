package General;

public class PrimeNumsBetweenRange 
{

	public static void prime(int a,int b)
	{
		int count=0;
		for(int j=a;j<=b;j++)
		{
			boolean flag=false;
			for(int i=2;i<=j/2;i++)
			{
			if(j%i==0)
			{
				count++;
				flag=true;
				break;
			}
			}
		if(flag)
		{
			System.out.println(j+" is not a prime number");
		}
		else
		{
			System.out.println(j+" is Prime number");
		}
		}
		System.out.println("total number of prime: "+((b-a+1)-count));
		System.out.println("total number of non-prime: "+(count));
	}
	
	public static void main(String[] args) 
	{
		//prime(0,10);
		//prime(1,20);
		//prime(2,30);
		prime(0,40);
	}

}
