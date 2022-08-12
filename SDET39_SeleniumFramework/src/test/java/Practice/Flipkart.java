package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./Data/Flipkart.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		
		
		String Url=pobj.getProperty("url");
		 String UN=pobj.getProperty("un");
		 String PW=pobj.getProperty("pw");
		 
		 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(Url);
	 
	 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(UN);
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PW);
	 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	 
	 driver.close();
	}

}
