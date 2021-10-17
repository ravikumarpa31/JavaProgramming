package General;

public class DuplicateWordsInString 
{
	public static void main(String[] args) 
	{
		String a="abc xyz !@# xyy xyz abc 123";
		String []b=a.split(" ");;
		for(int i=0;i<b.length;i++)
		{ 
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i].equals(b[j]))
				{
					System.out.println(b[i]);
				}
			}
		}
	}
}
