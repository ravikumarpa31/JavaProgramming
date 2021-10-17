package General;

import java.util.Arrays;

public class AscendingAndDescending {

	public static void main(String[] args) 
	{
		int [] a={5,4,3,9,-9,0,4,8,7,6};
		//Smallest
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.print("Descending Order: ");
			System.out.println(Arrays.toString(a));

		
		
		//Largest
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.print("Ascending Order: ");
			System.out.println(Arrays.toString(a));
	}

}
