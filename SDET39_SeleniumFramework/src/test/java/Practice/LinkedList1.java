package Practice;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Object> list = new LinkedList<Object>();
list.add("hii");
list.add(10);
list.add('A');
list.add(null);
list.add(10);
list.addFirst("Monika");
list.addLast("Singh");
System.out.println(list.getLast());
	System.out.println(list.getFirst());
	}

}
