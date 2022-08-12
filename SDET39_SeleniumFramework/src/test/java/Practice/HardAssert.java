package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {

	
	@Test
	public void createContact() {
		
		System.out.println("Step--1");
		System.out.println("Step--2");
		Assert.assertEquals("A","A");
		System.out.println("Step--3");
		System.out.println("Step--4");
	}
}
