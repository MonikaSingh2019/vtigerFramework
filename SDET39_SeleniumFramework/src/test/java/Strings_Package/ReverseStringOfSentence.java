package Strings_Package;

public class ReverseStringOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="welcome to blr city";//city blr to welcome
String[] s=str.split(" ");
for(int i=s.length-1;i>=0;i--)
{
	System.out.println(s[i]+" ");
}

	}

}
