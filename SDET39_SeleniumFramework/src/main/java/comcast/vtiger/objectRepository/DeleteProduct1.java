package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct1 {
	//initialization
		public DeleteProduct1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Declaration
		
		@FindBy(xpath="(//input[@title='Delete [Alt+D]'])[1]")
		private WebElement deleteProduct;

		
		//Getters
		public WebElement getdeleteProduct() {
			return deleteProduct;
		}
		
		//Bussiness Logic
	    /**
	     * This method is used for login to application
	     * @author monika
	     */
		public void deleteProduct(String prodName)
		{
			 deleteProduct.click();
		}
}
