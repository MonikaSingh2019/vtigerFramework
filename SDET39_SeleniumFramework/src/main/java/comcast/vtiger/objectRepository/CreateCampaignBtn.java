package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignBtn {
	//initialization
			public CreateCampaignBtn(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Declaration
			
			@FindBy(xpath="//img[@title='Create Campaign...']")
			private WebElement createCampaignBtn;

			//Getters
			public WebElement getCreateCampaignBtn() {
				return createCampaignBtn;
			}
			

			//Bussiness Logic
		    /**
		     * This method is used for login to application
		     * @author monika
		     */
			public void createCampaignBtn()
			{
				
				createCampaignBtn.click();
				
			}
}
