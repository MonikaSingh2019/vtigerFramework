package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignWithProduct {


	//initialization
	public CreateCampaignWithProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	
	@FindBy(xpath="campaignname")
	private WebElement createCampaign;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveCampaign;

	
	//Getters
	
	public WebElement getCreatecampaign() {
		return createCampaign;
	}

	public WebElement getSaveCampaign() {
		return saveCampaign;
	}
	

	
	//Bussiness Logic
    /**
     * This method is used for login to application
     * @author monika
     */
	public void createAndSaveCampaignName(String campaignName)
	{
		createCampaign.sendKeys(campaignName);
		saveCampaign.click();
		
		
	}
}
