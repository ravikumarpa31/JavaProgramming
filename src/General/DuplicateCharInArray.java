package General;

public class DuplicateCharInArray 
{

	public static void main(String[] args) 
	{
		char[]a={'a','1','a','b','#','b','2','1','#'};
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
