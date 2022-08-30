package PrintPatterns;

public class AlphabetpatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.println(ch++ +"  ");
			}
			System.out.println(); 
			
		}


	}

}
