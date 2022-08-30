package Strings_Package;

public class SwappingOfLastElementsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to blr city";
		            
		String[] s= str.split(" ");
		//str[0] str[1] str[2] str[3]
		String temp=s[0];//temp=welcome
		s[0]=s[s.length-1];//city
		s[s.length-1]=temp;//s[s.length-1]=welcome
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
		}
		
	}


