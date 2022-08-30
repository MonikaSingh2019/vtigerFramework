package Strings_Package;

public class CountTheVowelsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="india";
int count=0;
char[] s=s1.toCharArray();
for(int i=0;i<s1.length();i++) {
	System.out.println(s[i]);
	if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
{
		count++;
	}	
}
System.out.println("Total No. Of vowels are:"+count);
	}

}
