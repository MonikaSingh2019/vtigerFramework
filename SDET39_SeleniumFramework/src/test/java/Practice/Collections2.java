package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Collections2 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add('A');
//		Collections.sort(list);;
//		for(Integer integer.list)
//		{
//			System.out.println(integer);
//		}
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add(10);
		list2.add('A');
		list2.add(null);
		list2.add("Heello");
		//list2.retainAll(list2);
		list2.removeAll(list2);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list.get(3));
		
		
	}

}
