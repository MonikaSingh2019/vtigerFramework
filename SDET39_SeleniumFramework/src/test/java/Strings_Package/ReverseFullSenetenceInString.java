package Strings_Package;

public class ReverseFullSenetenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to blr city";//emoclew ot rlb ytic 
		String[] s= str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String strn=s[i];//s[i]=welcome to blr city
			                 //      0       1  2   3
			for(int j=strn.length()-1;j>=0;j--)
			{
				System.out.print(strn.charAt(j));
				
			}
			
			System.out.print(" ");
		}
		
	}

}
