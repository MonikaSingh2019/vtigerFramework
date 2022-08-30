package Practice;

import java.util.Hashtable;

public class hashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String> map = new Hashtable<Integer,String>();
map.put(104, "10");
map.put(102, "hello");
map.put(103, "hello");//duplicate values allowed
map.put(103, "hello");//duplicate keys are not allowed

map.put(105, "bye");
map.put(null, null);//null pointer exception
map.put(106, null);//null pointer exception
System.out.println(map);

	}

}
