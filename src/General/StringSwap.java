package General;

public class StringSwap 
{
	public static void main(String[] args) 
	{
		String a="Hey";
		String b="Hello";
		System.out.println(a);
		System.out.println(b);
		//a=a+b;
		a=a.concat(b);
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}
}
