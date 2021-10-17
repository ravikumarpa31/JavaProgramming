package General;

public class DuplicateWordsInStringArray 
{

	public static void main(String[] args) 
	{
		String [] a={"abc","123","xyz","xyz","abc","xyz","123","abc","xyz"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length-i-1;j++)
			{
				if(a[i].equals(a[j+1]))
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
