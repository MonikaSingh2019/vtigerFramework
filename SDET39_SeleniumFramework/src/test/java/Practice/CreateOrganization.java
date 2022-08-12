package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganization {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("./Data/CommonProperty.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		
		
		 String Url=pobj.getProperty("url");
		 String UN=pobj.getProperty("un");
		 String PW=pobj.getProperty("pw");
		
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(Url);
		 driver.findElement(By.name("user_name")).sendKeys(UN);
		 driver.findElement(By.name("user_password")).sendKeys(PW);
		 driver.findElement(By.id("submitButton")).click();
		 driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		 driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		 driver.findElement(By.name("accountname")).sendKeys("qr00st");
		 driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		 String actdata = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
		 String actualdata="qr00st";
		 if(actdata.contains(actualdata))
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
			
		driver.findElement(By.linkText("Sign Out")).click();

		 
		 driver.close();
		 
		 }
		 
		
		
	}


