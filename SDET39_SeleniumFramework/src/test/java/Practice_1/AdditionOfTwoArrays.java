package Practice_1;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		
//    int [] a= {5,1,2,4,2};
//    int [] b= {2,3,4,1,5};
//
//    int result [] = new int[5];
//
//    for(int i=0;i<5;i++)
//      {
//	  result[i] = a[i] + b[i];
//	  System.out.println("Enter sum of two Arrays="+result[i]);
//	  }
//    
//	  System.out.println();
//   
		int [] a= {5,1,2,4,2,2};
	    int [] b= {2,3,4,1,5};
		int length=a.length;
		if(a.length <b.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			} catch(Exception e) {
				if(a.length<b.length)
				{
				  System.out.println(b[i]+" ");	
				}else {
					System.out.println(a[i]+" "); //2
				}
			}
		}
		
	  }
      }


