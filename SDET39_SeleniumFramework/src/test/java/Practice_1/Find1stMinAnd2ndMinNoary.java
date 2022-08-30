package Practice_1;

public class Find1stMinAnd2ndMinNoary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,30,15,25,10,11};
		int min=a[0];
		System.out.println(min);
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println("FirstMin no is:="+min);
		
		int min2=a[1];
		//System.out.println(min2);
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<min2 && a[i] >min)
			{
				min2=a[i];
			}
			
		}
		System.out.println("Second Min no is:="+min2);
		
	}

}
