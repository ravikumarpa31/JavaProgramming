package General;

public class Pallindrome 
{

	public static void main(String[] args) 
	{
		int a=112111211;
		int temp=a;
		int rev=0;
		while(temp!=0)
		{
			int n=temp%10;
			rev=rev*10+n;
			temp=temp/10;
		}
		if(a==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Pallindrome");
		}

	}

}
