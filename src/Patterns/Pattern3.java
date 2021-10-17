package Patterns;

public class Pattern3 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<11;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=11;i>0;i--)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int i=0;i<11;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=10;i>0;i--)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
