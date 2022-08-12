package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement organizationModule;
	
	@FindBy(xpath="(//a[text()='Products'])[1]")
	private WebElement productModule;
	
	@FindBy(xpath="//a[@name='Campaigns']")
	private WebElement campaignModule;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutBtn;

	//Getters Method
	
	public WebElement getOrganizationModule() {
		return organizationModule;
	}

	public WebElement getProductModule() {
		return productModule;
	}


	public WebElement getCampaignModule() {
		return campaignModule;
	}
	
	public WebElement getSignOutBtn() {
		return signOutBtn;
	}
    
	//Bussiness Logic
    /**
     * This method is used for login to application
     * @author monika
     */
	
	public void organizationLink()
    {
		organizationModule.click();
		
    }
	public void productLink()
    {
	
		productModule.click();
    }
	public void campaignLink()
    {
	
		campaignModule.click();
    }
	
	

}

	
    
	 
	