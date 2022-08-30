package PrintPatterns;

public class ToPrintHalfIncreasingDecresing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;

		for(int i=1;i<=n;i++)//rows 
			//i=1 1<=5t
			//i=2 2<=5t
			//i=3 3<=5t
			//i=4 4<=5t
			//i=5 5<=5t
			//i=6 1<=6t terminate
			
		{
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) //columns
				//j=1 1<=5t
				//j=2 2<=5t
				//j=3 3<=5t
				//j=4 4<=5t
				//j=5 5<=5t
				//i=6 6<=5t terminate
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
