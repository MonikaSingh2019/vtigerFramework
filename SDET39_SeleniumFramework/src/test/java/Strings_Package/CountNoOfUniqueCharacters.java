package Strings_Package;

import java.util.LinkedHashSet;

public class CountNoOfUniqueCharacters {

	public static void main(String[] args) {
		String str = "Tester";//o/p:-tesr
		String s=str.toLowerCase();//s=tester
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
			//i=0 0<6t;
			//i=1 1<6t;
			//i=2 2<6t;
			//i=3 3<6t;
			//i=4 4<6t;
			//i=5 5<6t;
			//i=6 6<6f;
			
		{
			System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			//System.out.println(set);
		}
		System.out.println(set);
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch+" "+count);
			}
		}
		
	}

}
