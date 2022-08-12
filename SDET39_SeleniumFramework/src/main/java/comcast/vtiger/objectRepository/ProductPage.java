package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	
	//initialization
	
	public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='productname']")
	private WebElement createProduct;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveProduct;

	
	//Getters
	public WebElement getCreateProduct() {
		return createProduct;
	}

	public WebElement getSaveProduct() {
		return saveProduct;
	}
	
	
	//Bussiness Logic
    /**
     * This method is used for login to application
     * @author monika
     */
	public void enterProduct(String prodName)
	{
		createProduct.sendKeys(prodName);

		
	}
	public void saveProduct()
	{
		saveProduct.click();
		
	}
}
