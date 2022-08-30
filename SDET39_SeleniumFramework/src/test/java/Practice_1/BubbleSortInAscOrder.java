package Practice_1;

public class BubbleSortInAscOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {4,1,2,3,0};
for(int i=0;i<a.length;i++)
	//0 0<5 t
	//t 1<5 t
{
	System.out.println("a[i] ="+a[i]);
for(int j=i+1;j<a.length;j++)
	//j=0+1 1<5 t  ++=1
	//1+1=2 2<5 t
{
	System.out.println("a[j] ="+a[j]);
	if(a[i] > a[j])//4>1t 1>2f
	{
		System.out.println("a[i] ="+a[i]);
		System.out.println("a[j] ="+a[j]);
		int temp = a[i];//temp=4
		System.out.println("temp ="+temp);
		a[i]=a[j];//a[i]=1
		System.out.println("a[i] ="+a[i]);
		System.out.println("a[j] ="+a[j]);
		a[j]=temp;//a[j]=4
		System.out.println("a[j] ="+a[j]);
	}
	}
}
//main loop ends here
for(int k=0;k<a.length;k++)
{
	System.out.println(a[k]);
}
	}

}
