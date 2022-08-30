package Practice_1;

public class AscendingNoProg  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {4,1,0,5};
int fmin=a[0];//4
int smin =a[0];//4
for(int i=0;i<a.length;i++)
{
	//i=0 0<4t
	//i=1 1<4t
	//i=2 2<4t
	//i=3 3<4t
	//4<4 4<4f terminate
	if(a[i]<=fmin)//4<=4t,1<=4t,0<=1t,5<=0f
	{
		if(a[i]!=fmin)
		{
			smin=fmin;
		}
		fmin=a[i];
		else if(fmin==smin || smin>a{i])
		{
		smin=a[i];	
		}
	}
}
	}

}
