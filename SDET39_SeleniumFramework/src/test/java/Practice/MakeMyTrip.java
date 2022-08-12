package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.Properties;
import comcast.vtiger.genericUtilities.ExcelUtility;
import comcast.vtiger.genericUtilities.JavaUtility;
import comcast.vtiger.genericUtilities.PropertyUtlity;
import comcast.vtiger.genericUtilities.WebDriverUtility;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable {
	 PropertyUtlity plib = new PropertyUtlity();
	 WebDriverUtility wlib= new  WebDriverUtility();
	 
	 
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 wlib.waitForPageToLoad(driver);
	 String Url=plib.getPropertyKeyVAlue("url2");
	 driver.get(Url);
	 WebElement from =driver.findElement(By.xpath("//input[@id='fromCity']"));
	 WebElement toDes =driver.findElement(By.xpath("//input[@id='toCity']"));
	 
	 from.sendKeys("Bengaluru");
	 driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
	 toDes.sendKeys("Mumbai");
	 driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
	
	 driver.findElement(By.xpath("//label[@for='departure']")).click();
	 String enterMonth="October";
	 String enterYear="2022";
	 String enterDate="16";
	 
	 String currentMonthAndYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	 String currentMonth= currentMonthAndYear.split(" ")[0];
	 String currentYear= currentMonthAndYear.split(" ")[1];
	 System.out.println("Enter Month and year"+currentMonthAndYear);
	 
	 while (!(currentMonth.equalsIgnoreCase(enterMonth) && currentYear.equals(enterYear)))
			 {
		// System.out.println("Inside Loop");
		       driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		       currentMonthAndYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		       currentMonth= currentMonthAndYear.split(" ")[0];
		  	   currentYear= currentMonthAndYear.split(" ")[1];
		       
			 }
	 driver.findElement(By.xpath("(//p[text()='"+enterDate+"'])[1]")).click();
	 driver.close();
	 //driver.findElement(By.xpath("(//p[text()='16'])[1]")).click();
	 
	 //driver.findElement(By.xpath("(//p[text()='10'])[1]")).click();
	 //driver.findElement(By.xpath("//span[text()='RETURN']")).click();
	// driver.findElement(By.xpath("(//p[text()='10'])[2]")).click();
	 
	
	} 
	 

}
