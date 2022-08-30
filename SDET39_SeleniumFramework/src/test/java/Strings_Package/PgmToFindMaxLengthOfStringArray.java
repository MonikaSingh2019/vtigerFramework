package Strings_Package;

public class PgmToFindMaxLengthOfStringArray{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] s= {"ab","abc","abcd","abcdef","abcd"};//maxLength=abcDef
String maxLength=s[0];
System.out.println(maxLength.length());//2
for(int i=1;i<s.length;i++)
{
	System.out.println(s[i].length());//3 4 5 4
	if(maxLength.length()<s[i].length())//2<3  5<4
	{
		maxLength=s[i];//3 4 5
	}
}
for(int i=0;i<s.length;i++)
{
	if(maxLength.length()==s[i].length()) {
		System.out.println(s[i]);
	}
}
	}

}
