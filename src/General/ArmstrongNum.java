package General;

public class ArmstrongNum 
{
	//123=1*1*1+2*2*2+3*3*3=1+8+27=36=not Armstrong
	//153=1*1*1+5*5*5+3*3*3=1+125+27=153=Armstrong
	public static void main(String[] args) 
	{
		int a=153;
		int temp=a;
		int rev=0;
		while(temp!=0)
		{
			int n=temp%10;
			rev=(rev)+(n*n*n);
			temp=temp/10;
		}
		System.out.println("Given num: "+a);
		System.out.println("Sum of Cube of num: "+rev);
		if(a==rev)
		{
			System.out.println("Armstromg number");
		}
		else
		{
			System.out.println("Not a Armstromg number");
		}
	}
}
