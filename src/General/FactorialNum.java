package General;

public class FactorialNum 
{
	//5=5*4*3*2*1=120=Factorial of 5
	public static void main(String[] args) 
	{
		int a=1;
		int temp=a;
		int fact=1;
		for(int i=temp;i>1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorail is: "+fact);
	}
}
