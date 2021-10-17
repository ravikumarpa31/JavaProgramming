package General;

public class PrimeNum 
{
	public static void prime(int a)
	{
		int temp=a;
		boolean flag=false;
		for(int i=2;i<=a/2;i++)
		{
			if(temp%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(a+" is not a prime number");
		}
		else
		{
			System.out.println(a+" is Prime number");
		}
	}
	
	public static void main(String[] args) 
	{
		prime(0);
		prime(1);
		prime(2);
		prime(3);
		prime(4);
		prime(5);
		prime(6);
		prime(7);
		prime(8);
		prime(9);
		prime(10);
		prime(11);
	}
}
