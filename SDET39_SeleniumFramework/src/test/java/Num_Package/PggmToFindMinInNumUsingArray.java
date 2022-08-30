package Num_Package;

public class PggmToFindMinInNumUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,123,1737,7488623,72383};//maxLength=abcDef
		int minLength=a[0];
		//System.out.println(maxLength.length);//2
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);//3 4 5 4
			if(minLength > a.length)//2<3  5<4
			{
				minLength=a[i];//3 4 5
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(minLength==a[i]) {
				System.out.println(a[i]);
			}
		}
	}

}
