package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductValidation {
	//initialization
	 public ProductValidation(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
	
	//Declaration
	 @FindBy(css="span.lvtHeaderText")
	 private WebElement actualProductData;
	 
	 //Getters

	 public WebElement getActualProductData() {
	  return actualProductData;
	 }

	 public String actualProductName()
	 {
	  return actualProductData.getText();
	 }
	 
	 
}
