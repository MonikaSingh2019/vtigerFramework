package comcast.vtiger.genericUtilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	private static final By Element = null;

	/**
	 * wait for to page to load before identifying any synchronized element inDOM
	 * @author Monika
	 */
	
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	/**
	 * After every action it will wait for next action to perform
	 * @author Monika
	 */
	
	 public void scriptTimeOut(WebDriver driver)
	 {
		 driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
	 }
	
	 
	 /**
		 * It is used to wait for a element to be clickable in GUI and check for specific condition for after every 500ms
		 * @author Monika
		 */
	 
	 public void waitForElementToBeClickable(WebDriver driver,WebElement Element)
	 {
		 WebDriverWait wait = new WebDriverWait(driver,(20));
		 wait.until(ExpectedConditions.elementToBeClickable(Element));
	 
	 }
	 
	 /**
	     * @param
		 * Used to wait for element to be clickable in GUI and check for Specific for every 500miliseconds.
		 * @author 
		 */
	 
	 
	 
	 public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
	 {
	 
	 FluentWait wait = new FluentWait(driver);
	 wait.pollingEvery(Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.elementToBeClickable(Element));
	
	
	 }
	 
	 
	 /**
	     * @param driver
	     * @param PartialWindowTitle
		 * This method is used to switch to any window based on window Title
		 * @author Monika
		 */
	 
	 
	 public void switchToWindow(WebDriver driver,String PartialWindowTitle)
	 {
		 Set<String> allId = driver.getWindowHandles();
			Iterator<String> it=allId.iterator();
			while(it.hasNext())
			{
				String wid =it.next();
				driver.switchTo().window(wid);
				if(driver.getTitle().contains(PartialWindowTitle))
				{
					break;
				}
			}
	 }
	
	 /**
	     * @param driver
		 * This method is used to switch to alert window and accept it(click on ok)
		 * @author Monika
		 */
	 public void switchToAlertAndAcccept(WebDriver driver) 
	 {
			driver.switchTo().alert().accept();
		}
	 
	 /**
	     * @param driver
		 * This method is used to switch to alert window and dismiss it(click on cancel button)
		 * @author Monika
		 */
	 public void switchToAlertAndDismiss(WebDriver driver) 
	 {
			driver.switchTo().alert().dismiss();
		}

	 /**
	     * @param driver
	     * @param Index
		 * This method is used to switch to frame window based on Index
		 * @author Monika
		 */
	 
	 public void switchToFrame(WebDriver driver,int index)
	 {
			driver.switchTo().frame(index);
		}
	 /**
	     * @param driver
	     * @param id_name_attribute
		 * This method is used to switch to frame window based on id or name attribute
		 * @author Monika
		 */
	 public void switchToFrame(WebDriver driver,String id_name_Attribute) 
	 {
			driver.switchTo().frame(id_name_Attribute);
		}
	 
	 /**
	     * @param element
	     * @param index
		 * This method is used to select value from the dropdownbased on index
		 * @author Monika
		 */
	 public void selectDropDown(WebElement element,int index) {
			Select sel=new Select(element);
			sel.selectByIndex(index);
			
			}
	 /**
	     * @param element
	     * @param text
		 * This method is used to select value from the dropdown based on value
		 * @author Monika
		 */
	 public void selectDropDown(WebElement element,String text) {
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
			
			}
	 /**
	     * @param element
	     * @param driver
		 * used to place mouse cursor on specified elements
		 * @author Monika
		 */
	 public void mouseOverOnElement(WebDriver driver,WebElement element)
	 {
		 Actions act = new Actions(driver);
		 act.moveToElement(element).perform();
	 }
	 
	 /**
	     * @param element
	     * @param driver
		 * used to right click on specified elements
		 * @author Monika
		 */
	 public void rightClickOnElement(WebDriver driver,WebElement element)
	 {
		 Actions act = new Actions(driver);
		 act.contextClick(element).perform();
	 }
	 
	 /**
	     * @param element
	     * @param driver
	     *  @param target
		 * used to right click on specified elements
		 * @author Monika
		 */

	 public void draganddrop(WebDriver driver,WebElement source,WebElement target) {
			Actions a=new Actions(driver);
			a.dragAndDrop(source, target).perform();
		}









}
