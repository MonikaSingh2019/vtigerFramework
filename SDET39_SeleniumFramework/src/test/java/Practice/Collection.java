package Practice;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add('A');
		list.add("Hii");
		list.add(null);
		list.add("add123");
		System.out.println(list);
		list.add(1, "Array");
		list.add(2, null);
		System.out.println(list);
		ArrayList<Object> list2=new ArrayList<Object>();
		list2.add("hello");
		list2.add("ArrayList2");
		list2.addAll(list2);
		System.out.println(list);
		System.out.println(list2);
		if(list.contains('B'))
				{
			System.out.println("Yes");
				}
		else
		{
			System.out.println("No");
		}
	}

}
