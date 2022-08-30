package Num_Package;

public class Demo1111 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
//        String str = "Automation";
//        StringBuilder str2 = new StringBuilder();
//        str2.append(str);
//        str2 = str2.reverse();     // used string builder to reverse
//       System.out.println(str2);
		String str = "Saket Saurav";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int  i=0;i= chars.length-1;i--) {
            System.out.print(chars[i]);
        }
        }
}
