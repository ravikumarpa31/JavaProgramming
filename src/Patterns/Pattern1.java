package Patterns;

public class Pattern1 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int k=0;k<5;k++)
		{
			for(int l=5;l>k;l--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int k=0;k<5;k++)
		{
			for(int l=4;l>k;l--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
