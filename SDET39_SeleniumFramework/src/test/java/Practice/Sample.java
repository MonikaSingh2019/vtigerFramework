
package Practice;

import org.testng.annotations.Test;

public class Sample {

@Test (invocationCount=-3)

public void createContact() {
	System.out.println("Create Cretaed");
}

@Test (priority=1 ,invocationCount=3)
public void modifyContact() {
	System.out.println("modified Contact");
}
@Test(priority=2)	
public void deleteContact() {
	System.out.println("Contact deleted");
}
}