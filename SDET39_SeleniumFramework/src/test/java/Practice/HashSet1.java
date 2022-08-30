package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Object> set = new HashSet<Object>();
set.add(10);
set.add(10);
set.add('A');
set.add("ABC");
set.add(40);
set.add(null);
set.add(null);
set.remove('A');
Iterator<Object> it = set.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

	}

}
