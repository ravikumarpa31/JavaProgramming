package General;

public class ReverseInteger 
{

	public static void main(String[] args) 
	{
		//1. Math
		int a=1012;
		int temp=a;
		int reverse1=0;
		while(temp!=0)
		{
			int n=(temp%10);
			reverse1=n+(reverse1*10);
			temp=temp/10;
		}
		System.out.println(reverse1);
		
		
		//2. String and StringBuffer
		int a2=1234;
		int temp2=a2;
		int reverse2=0;
		String s=String.valueOf(temp2);
		StringBuffer sb=new StringBuffer(s);
		String temp3=sb.reverse().toString();
		reverse2=Integer.parseInt(temp3);
		System.out.println(reverse2);
	}

}
