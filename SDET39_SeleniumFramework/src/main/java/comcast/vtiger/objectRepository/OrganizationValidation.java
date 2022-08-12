package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationValidation {
	//initialization
		 public OrganizationValidation(WebDriver driver)
		 {
		  PageFactory.initElements(driver, this);
		 }
		
		//Declaration
		 @FindBy(xpath="//span[@class='dvHeaderText']")
		 private WebElement actualOrgData;
		 
		 //Getters

		 public WebElement getActualOrgData(){
		  return actualOrgData;
		 }

		 public String actualOrgName()
		 {
		  return actualOrgData.getText();
		 }
		 
}
