package Strings_Package;

public class StringPalindrome {

	public static void main(String[] args) {
	
  String s="MOME"; //mom=mom //malayalam=malayalam
  String rev="";
  for(int i=s.length()-1;i>=0;i--)
  {
	  rev=rev+s.charAt(i);
  }
  if(s.equals(rev))//mome.equls(emom) ==false
  {
	  System.out.println("Its a palindrome");
  }else {
	  System.out.println("Its not a palindrome");
  }
	}

}
