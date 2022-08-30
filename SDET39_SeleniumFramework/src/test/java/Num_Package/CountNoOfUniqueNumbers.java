package Num_Package;

import java.util.LinkedHashSet;

public class CountNoOfUniqueNumbers {

	public static void main(String[] args) {
        int[] a= {4,1,1,3,5,6,7,6};
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		for (int i = 0; i <a.length; i++)
        {
            
        	set.add(a[i]);
 
    }
		//System.out.println(set);
		for(Integer num : set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
				{
					count++;
					
				}
				
			}
			if(count==1)
			{
				System.out.println(num+" "+count);
			}
		}
		
		
        

	}

}
