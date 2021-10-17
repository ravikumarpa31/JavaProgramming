package General;

public class DuplicateCharInString 
{

	public static void main(String[] args) 
	{
		String arr="a1acb#b21#c";
		char[]a=arr.toCharArray();
		for(int i=0;i<arr.length();i++)
		{
			a[i]=arr.charAt(i);
		}

		for(int i=0;i<a.length-1;i++){
		for(int j=i+1;j<a.length;j++)
		{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					
				}
		}
		}

	}

}
