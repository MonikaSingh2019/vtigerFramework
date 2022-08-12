package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	
	@Test(dataProvider = "dataProviderMethod")
	public void bookingTicket(String src,String des)
	{
		System.out.println("Book Tickets from " +src+ " to " +des+ "");
	}
	
	@DataProvider
	
	public Object[][] dataProviderMethod()
	{
		Object[][] objArr = new Object[5][2];
		objArr[0][0]="Banglore";
		objArr[0][1]="Goa";
		
		objArr[1][0]="Banglore";
		objArr[1][1]="Mysore";
		
		objArr[2][0]="Banglore";
		objArr[2][1]="Manglore";
		
		objArr[3][0]="Banglore";
		objArr[3][1]="Mumbai";
		
		objArr[4][0]="Banglore";
		objArr[4][1]="Kerala";
		
		
		return objArr;
		
	}
}
