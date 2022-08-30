package Num_Package;

public class PgmToAddSumOfSingleDigit {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String s="1a3b4";//25
		//abzx 123 @!&
		
	    int sum=0;
	    
	    for(int i=0;i<s.length();i++) {
	    //i=0  0<6=1
	    //i=1  1<6=2
	    //i=2  2<6=a
	    //i=3  3<6=b
	    //i=4  4<6=1
	    //i=5  5<6=3
	    	//i=6  6<6=terminate
	    	
	    
	    	if(s.charAt(i)>='0' && s.charAt(i)<='9')//true 
	    	{
	    		int n=s.charAt(i)-48;//n=3 51-48=3  1  2  3  4  5  6  7
	    		                                   //49 50 51  52 53 54 55
	    		sum=sum+n;
	    	}
	
	    }
	    //12+13=25
	    
		System.out.println(sum);//25
}
}