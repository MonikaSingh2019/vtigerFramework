package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectProdInCampaign {

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
		 
		 WebElement element = driver.findElement(By.xpath("//a[text()='More']"));

			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
			
			driver.findElement(By.name("Campaigns")).click();
			//Create Campaign...
			driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();	
			driver.findElement(By.xpath("//img[@title='Select']")).click();
            String parentHandle=driver.getWindowHandle();
            Set<String> childHandle=driver.getWindowHandles();
	         for(String currenthandle :childHandle)
	         {
	        	 if(!currenthandle.equals(parentHandle))
	        	 
	        		{
	        		 
	        		 driver.switchTo().window(currenthandle);
	        		 driver.findElement(By.id("search_txt")).sendKeys("www");
	        		 driver.findElement(By.name("search")).click();
	        		 driver.findElement(By.xpath("//a[@id='1']")).click();
	        		 
	        		}	 
	        	 driver.switchTo().window(parentHandle);
	         }
	         driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();	
			 Random ran =new Random();
			 int ranNum = ran.nextInt(1000);
			    FileInputStream fis1=new FileInputStream("./Data/Organize.xlsx"); 
				Workbook wb = WorkbookFactory.create(fis1);
				Sheet sh = wb.getSheet("Sheet1");
				
				Row r= sh.getRow(1);
				Cell cel = r.getCell(0);
				String orgName = cel.getStringCellValue()+ranNum;
				System.out.println(orgName);
				
				driver.findElement(By.name("campaignname")).sendKeys(orgName);
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				System.out.println(actData);
				if(actData.contains(orgName))
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("Fail");
				}
				
				WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

				
				a.moveToElement(ele).perform();
					
				driver.findElement(By.linkText("Sign Out")).click();

				 
				 driver.close();
	         
	
	}

}
