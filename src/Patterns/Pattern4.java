package Patterns;

public class Pattern4 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<6;i++)
		{char a='A';
			for(int j=0;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
		
		System.out.println();
		char a='A';
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a+" ");
			}
			a++;
			System.out.println();
		}
		
		
		System.out.println();
		char b='A';
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		}

	}

}
