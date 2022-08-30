package Strings_Package;

public class ToRemoveSpaceBetweenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="welcome to blr city";
String[] s= str.split(" ");
for(int i=s.length-1;i>=0;i--)
{
	System.out.println(s[i]+" ");
}
System.out.print("Value is :"+str.replaceAll(" ",""));
//System.out.println(str.replaceAll(" ",""));
	}

}
