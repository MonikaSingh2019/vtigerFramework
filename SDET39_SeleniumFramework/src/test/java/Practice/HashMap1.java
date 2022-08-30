package Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer,String> map = new HashMap <Integer,String>();
map.put(10, "10");
map.put(113, "null");
map.put(11, "null");
map.put(null, "jxxj");
map.put(12, "hello");
map.put(10, "10");
map.put(null, "11");
//System.out.println(map);
for(Entry<Integer, String> m: map.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
}


	}

}
