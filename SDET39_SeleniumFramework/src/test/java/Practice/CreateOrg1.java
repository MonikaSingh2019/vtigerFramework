package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrg1 {

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
		 
	}

}
