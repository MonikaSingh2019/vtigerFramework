package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./Data/Actitime.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		
		
		String Url=pobj.getProperty("url");
		 String UN=pobj.getProperty("un");
		 String PW=pobj.getProperty("pw");
		 
		 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(Url);
	 
	 driver.findElement(By.id("username")).sendKeys(UN);
	 driver.findElement(By.name("pwd")).sendKeys(PW);
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 
	 //driver.close();
	}

}
