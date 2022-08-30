package Practice;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Object> s = new Stack<Object>();
s.push(10);//3
s.push(20);//2
s.push('A');//1
System.out.println(s.search('A'));
System.out.println(s.search(20));
System.out.println(s.search(10));
//System.out.println(s.pop());
//System.out.println(s.pop());
//System.out.println(s.pop());
	}

}
