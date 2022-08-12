package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {

	//initialization
	public CampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement createCampaign;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveCampaign;
	//For Product
	@FindBy(xpath="//img[@title='Select']")
	private WebElement createProduct;

	
	//Getters
	
	public WebElement getCreatecampaign() {
		return createCampaign;
	}

	public WebElement getSaveCampaign() {
		return saveCampaign;
	}
	public WebElement getcreateProduct() {
		return createProduct;
	}
	
	//Bussiness Logic
    /**
     * This method is used for login to application
     * @author monika
     */
	public void createCampaignName(String campaignName)
	{
		createCampaign.sendKeys(campaignName);
		
		
	}
	public void saveCampaignName()
	{
		saveCampaign.click();
			
	}
	
	public void clickToSelectProduct() {
		// TODO Auto-generated method stub
		createProduct.click();
	}
	
	
}
