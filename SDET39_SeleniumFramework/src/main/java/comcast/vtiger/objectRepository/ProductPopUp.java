package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPopUp {
	
	
	//initialization
		public ProductPopUp(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Declaration
		
		@FindBy(xpath="//input[@id='search_txt']")
		private WebElement typeProductName;
		
		@FindBy(name="search")
		private WebElement searchProduct;
		
		
		
		//Getters Method
		
		public WebElement getTypeProductName() {
			return typeProductName;
		}

		
		public WebElement getSearchProduct() {
			return searchProduct;
			
		}


		
		
		
		//Bussiness Logic
	    /**
	     * This method is used for login to application
	     * @author monika
	     */
		public void typeProdname(String prodName)
		{
			typeProductName.sendKeys(prodName);
			
		}
		public void searchProdName(WebDriver driver,String prodName)
		{
			
			searchProduct.click();
			//driver.findElement(By.xpath("//a[text()='"+prodName+"']")).click();
			//driver.findElement(By.id("//a[@id='1']")).click();
			
		}

}
