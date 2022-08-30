package Practice_1;

public class SortArrayInAscDescOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,1,2,3,0};
		for(int i=0;i<a.length;i++)//fetching elements from array one by one
			
		{
			//System.out.println("a[i] ="+a[i]);
		for(int j=i+1;j<a.length;j++) //iterating elements one after another
			
		{
			//System.out.println("a[j] ="+a[j]);
			if(a[i] > a[j])//4>1t 1>2f 1>3f (>)---> ascending ,(<)------>Descending
			{
				
				int temp = a[i];//temp=4=4 1==1
				
				a[i]=a[j];//1=1 0=0
				a[j]=temp;//4=4 1=1
				
			}
			}
		}
		//main loop ends here
		
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		 System.out.println();
		 for(int i=a.length-1;i>=0;i--)
		 {
			 System.out.println(a[i]);
		 }
	}

}
