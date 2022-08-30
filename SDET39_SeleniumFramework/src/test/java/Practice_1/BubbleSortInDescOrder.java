package Practice_1;

public class BubbleSortInDescOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,1,2,3,0};
		for(int i=0;i<a.length;i++)//fetching elements from array one by one
			//0 0<5 t
			//t 1<5 t
		{
			System.out.println("a[i] ="+a[i]);
		for(int j=i+1;j<a.length;j++) //iterating elements one after another
			//j=0+1 1<5 t  j=1 1<5t
			//j=2 2<5 t
			//j=3 3<5 t
			//j=4 4<5 t
		{
			System.out.println("a[j] ="+a[j]);
			if(a[i] < a[j])//4>1t 1>2f 1>3f (>)---> ascending ,(<)------>Descending
			{
				
				int temp = a[i];//temp=4=4 1==1
				System.out.println("temp ="+temp);
				a[i]=a[j];//1=1 0=0
				a[j]=temp;//4=4 1=1
				System.out.println("a[j] ="+a[j]);
			}
			}
		}
		//main loop ends here
		for(int k=0;k<a.length;k++)//printing elements after sorting
		{
			System.out.println(a[k]);//4,3,2,1,0
		}
	}

}
