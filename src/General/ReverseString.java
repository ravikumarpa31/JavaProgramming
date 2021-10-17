package General;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		//1. StringBuffer
		String a="abcd1234#";
		StringBuffer sb=new StringBuffer(a);
		String reverse1=sb.reverse().toString();
		System.out.println(sb);
		System.out.println(reverse1);
		
		//2. for loop
		String b="abcd1234#";
		int length=b.length();
		String reverse2="";
		for(int i=length-1;i>=0;i--)
		{
			reverse2=reverse2+b.charAt(i);
		}
		System.out.println(reverse2);
	}

}
