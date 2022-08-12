package Practice;

import java.io.File;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.BaseClass;


public class ScreenshotVtiger extends BaseClass{
	@Test
	public void screen() throws Throwable {
				
		    TakesScreenshot ts=(TakesScreenshot) driver;
			File RAM=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./photo/home.png");
			FileUtils.copyFile(RAM, dest);
	    	driver.close();

	
}
}