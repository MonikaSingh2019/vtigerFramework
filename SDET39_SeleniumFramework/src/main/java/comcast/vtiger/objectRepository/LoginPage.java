package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		//initialization
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	@FindBy(name="user_password")
	private WebElement userPasswordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;

	//Getter Methods
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	public WebElement getUserPasswordTextField() {
		return userPasswordTextField;
	}
    public WebElement getSubmitButton() {
		return loginButton;
	}
    
    //Bussiness Logic
    /**
     * This method is used for login to application
     * @param username
     * @param password
     * @author monika
     */
    
     public void login(String username,String password)
     {
    	 userNameTextField.sendKeys(username);
    	 userPasswordTextField.sendKeys(password);
    	 loginButton.click();
     }

}
