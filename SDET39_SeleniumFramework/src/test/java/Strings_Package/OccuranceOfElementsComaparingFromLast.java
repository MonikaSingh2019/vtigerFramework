package Strings_Package;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OccuranceOfElementsComaparingFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
		String str=sc.next();
		String s=str.toLowerCase();
		
		

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
			
			set.add(s.charAt(i));
		}
		
		for(Character ch:set)
		{
			
			for(int i=s.length()-1;i>=0;i--)//r e t s e t
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"="+(i+1));	
					break;
				}
			}
			
	}

	}

}
