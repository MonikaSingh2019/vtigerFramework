package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignValidation {

	public CampaignValidation(WebDriver driver)
	{
		//initialization
		PageFactory.initElements(driver,this);
	}
	
	//Declaration
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement actualCampaignData;
	
	//Getters
	
	public WebElement getActualCampaignData() {
	return actualCampaignData;
	}
	
	//Bussiness Logic
    /**
     * This method is used for campaign page validation
     * @author monika
     */
	public String actualCampaignName() {
		
		return actualCampaignData.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
