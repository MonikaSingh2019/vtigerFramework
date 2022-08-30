package Num_Package;

import java.util.ArrayList;

public class PrintPositionOfEachNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,1,1,3,5,6,7,6};
		ArrayList<Integer> set = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			
			//set.add(a[i]);
			System.out.println(a[i]+" "+(i+1));
		}
		
	}

}
