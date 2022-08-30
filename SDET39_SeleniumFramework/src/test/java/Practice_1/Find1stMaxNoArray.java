package Practice_1;

public class Find1stMaxNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {20,10,5,0};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("first max no in array="+max);
		int max1=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(max1<a[i] && a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Second max no in array="+max1);
	}

}
