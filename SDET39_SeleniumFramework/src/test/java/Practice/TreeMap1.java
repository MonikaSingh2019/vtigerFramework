package Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Integer,String> map = new TreeMap <Integer,String>();
		map.put(10, "10");
		map.put(113, "null");
		map.put(11, "null");
		map.put(104, "jxxj");
		map.put(12, "hello");
		map.put(10, "10");
		//map.put(null, "11");
		System.out.println(map);
//		for(Entry<Integer, String> m: map.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
	}

}
