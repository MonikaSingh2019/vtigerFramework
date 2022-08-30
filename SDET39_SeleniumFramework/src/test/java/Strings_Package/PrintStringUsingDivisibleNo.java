package Strings_Package;

import java.util.Scanner;

public class PrintStringUsingDivisibleNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//24%5=="hi"
//24%3=="bye"
//24%5&3 =="hi bye"
		// ==goodbye
//int num=24;
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();

if(num%3==0 && num%5==0) 
   {
	System.out.println("Hi");
   }else if(num%3==0) {
	System.out.println("Bye");
   }else if(num%5==0) {
	System.out.println("Hi bye");
   }else {
	System.out.println("Goodbye");
   }
		
   }

}
