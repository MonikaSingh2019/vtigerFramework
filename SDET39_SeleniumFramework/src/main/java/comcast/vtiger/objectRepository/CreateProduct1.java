package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProduct1 {

	//initialization
			
			public CreateProduct1(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
	
			//Declaration
			
			@FindBy(xpath="//img[@title='Create Product...']")
			private WebElement createProduct;
	
		
			//Getters
			
			public WebElement getCreateProduct() {
				return createProduct;
			}
			
			
			//Bussiness Logic
		    /**
		     * This method is used for login to application
		     * @author monika
		     */
			
			public void createProductBtn()
		    {
				
				createProduct.click();
		    }

}
