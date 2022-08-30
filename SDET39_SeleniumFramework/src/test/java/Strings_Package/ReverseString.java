package Strings_Package;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s="Monika";//akinom
//for(int i=s.length()-1;i>=0;i--)
//{
//	System.out.println(s.charAt(i));
//}
		//Reverse String Using Third Variable
//		String a="Monika";
//		String rev="";
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			rev=rev+a.charAt(i);
//		}
//		System.out.println(rev);
		
		//Reversing string USing toCharArray
		String s="Monika";
		char[] name= s.toCharArray();
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
	}

}
