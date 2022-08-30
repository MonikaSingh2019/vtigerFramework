package PrintPatterns;

public class TwoDecreasingTraiangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
for(int i=1;i<=n;i++)//rows
			
		{
			for(int j=1;j<=i;j++) //for space
				{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) //columns
				
			{
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++) //columns
				
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
