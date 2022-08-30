package Strings_Package;

import java.util.LinkedHashSet;

public class RemoveRepeatingVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) 
		{
			set.add(s.charAt(i));
			
			}
		System.out.println(set);
	}

}
