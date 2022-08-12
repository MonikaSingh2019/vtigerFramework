package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization {

	public CreateOrganization(WebDriver driver)
	{
		//initialization
		PageFactory.initElements(driver, this);
	}
	
    //Declaration Method
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganization;

	//Getters Method
	public WebElement getCreateOrganization() {
		return createOrganization;
	}
	
	//Bussiness Logic
    /**
     * This method is used for login to application
     * @author monika
     */
	public void createOrganizationBtn()
	{
		createOrganization.click();
		
	}
}
