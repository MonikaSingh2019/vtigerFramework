package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSample {
	
	@Test
public void createContact() {
		
		System.out.println("Step--1");
		System.out.println("Step--2");
		SoftAssert s = new SoftAssert();
		s.assertEquals("AA", "C");
		System.out.println("Step--3");
		System.out.println("Step--4");
	}
@Test
public void deleteContact() {
		
		System.out.println("Step--1 to delete");
		System.out.println("Step--2 to delete");
		SoftAssert s = new SoftAssert();
		s.assertEquals("AA", "C");
		System.out.println("Step--4");
		System.out.println("Step--5");
	}
		
	
}
