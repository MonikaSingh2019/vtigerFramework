package Practice;

import org.testng.annotations.Test;




public class SampleTestNg1 {

	@Test(priority=1)

	public void createOrganization() {
		System.out.println("Organization Created");
		int [] arr = {1,2,3};
		System.out.println(arr[5]);
	}
	@Test(dependsOnMethods ="createOrganization" )
	public void editOrganization() {
		System.out.println("Edit Organization");
	}
	@Test(dependsOnMethods ="editOrganization" )
	public void deleteOrganization() {
		System.out.println("Delete Organization");
	}
	
	
	
	
}
