package Num_Package;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class countNoOfDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] a={4,1,1,3,5,6,7,6};
ArrayList<Integer> set = new ArrayList<Integer>();
for(int i=0;i<a.length;i++)
{
	set.add(a[i]);
}

for(Integer num: set)
{
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(num==a[i]) {
			count++;
		}
		
	}
	
	if(count>1) {
		System.out.println(num+" "+count);
	}
		
	}
	}


	}


