package Practice;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Object> queue = new PriorityQueue<Object>();
queue.add('a');
queue.add('b');
queue.add('c');
System.out.println(queue.peek());
System.out.println(queue);
System.out.println(queue.poll());
System.out.println(queue);


	}

}
