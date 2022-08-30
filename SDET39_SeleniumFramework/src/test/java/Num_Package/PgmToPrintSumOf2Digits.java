package Num_Package;

public class PgmToPrintSumOf2Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12ab13";//25
		//abzx 123 @!&
		
	    int sum=0;
	    int tsum=0;
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
	    		tsum=tsum*10+n;//13=1*10+3=13      49 50 51  52 53 54 55
		}else {
			sum=sum+tsum;//12=12+0;
			tsum=0; //0 0
		}
	
	    }
	    sum=sum+tsum;//12+13=25
	    
		System.out.println(sum);//25
	
}}

