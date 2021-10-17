package General;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray 
{

	public static void main(String[] args) 
	 {
		//For loop
		String [] names={"ABC","XYZ","123","AX1#","AX1#","XYZ"};
		for(int i=0;i<names.length;i++)	{
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
				System.out.println("Duplicate is: "+names[j]);
				}
			}
	 	}
		
		//HashSet
		Set<String>set=new HashSet<String>();
		for(String name: names)
		{
			if(set.add(name)==false)
			{
				System.out.println("Dulpicate is: "+name);
			}

		}
	}

}
