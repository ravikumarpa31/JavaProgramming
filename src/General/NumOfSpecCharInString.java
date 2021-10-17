package General;

public class NumOfSpecCharInString 
{

	public static void main(String[] args) 
	{
		String a="abgfnvabaab";
		char[]b=a.toCharArray();
		int count=0;
		for(char c:b)
		{
			if(c=='b')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
