package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	//initialization
	public OrganizationPage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
		}

		//Declaration
		
		@FindBy(name="accountname")
		private WebElement enterOrganizationName;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveOrganizationName;

		

		//Getters Method
		public WebElement getenterOrganizationName() {
			return enterOrganizationName;
		}
		public WebElement getSaveOrganizationName() {
			return saveOrganizationName;
		}
		
		//Bussiness Logic
	    /**
	     * This method is used for login to application
	     * @author monika
	     */
		
		public void createOrganization(String orgName)
	    {
			enterOrganizationName.sendKeys(orgName);
			
	    }
		public void saveOrg()
	    {
			
			saveOrganizationName.click();
	    }
}
