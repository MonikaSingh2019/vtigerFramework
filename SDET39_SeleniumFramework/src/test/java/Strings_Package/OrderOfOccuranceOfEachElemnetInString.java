package Strings_Package;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfEachElemnetInString {

	public static void main(String[] args) {
		
String s = "tester";
		

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i)+"="+(i+1));//i means index(index starts from 1 that is why i+1
		}
	}

}
