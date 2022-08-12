package Practice;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {
	

	

		public static void main(String[] args) throws Throwable {
			// TODO Auto-generated method stub
			
			FileInputStream fis = new FileInputStream("./Data/CommonProperty.properties");
			Properties pobj = new Properties();
			pobj.load(fis);
			
			
			String Url=pobj.getProperty("url");
			 String UN=pobj.getProperty("un");
			 String PW=pobj.getProperty("pw");
			 
			 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(Url);
		 
		 driver.findElement(By.name("user_name")).sendKeys(UN);
		 driver.findElement(By.name("user_password")).sendKeys(PW);
		 driver.findElement(By.id("submitButton")).click();
		 
		 driver.close();
		}

	}


