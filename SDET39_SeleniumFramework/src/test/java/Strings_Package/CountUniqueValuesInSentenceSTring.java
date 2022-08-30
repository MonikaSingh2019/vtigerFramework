package Strings_Package;

import java.util.LinkedHashSet;

public class CountUniqueValuesInSentenceSTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to to blr city";
		String[] str =s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
			//i=0 0<6t;
			//i=1 1<6t;
			//i=2 2<6t;
			//i=3 3<6t;
			//i=4 4<6t;
			//i=5 5<6t;
			//i=6 6<6f;
			
		{
			set.add(str[i]);
		}
		//System.out.print(set);
		for(String stri : set)
		{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(stri.equals(str[i]))
			{
				count++;
			}
		}
		if(count==1) {
			System.out.println(stri+" "+count);
		}
		
			}
	}

}
