package General;

public class RemoveJunkChar 
{

	public static void main(String[] args) 
	{
		String a="@1234 #asdfgh &ADFHB @#$ 1aA@";
		String temp=a;
		String result=temp.replaceAll("[^ Sa-zA-Z0-9]", "");
		System.out.println(result);
	}

}
