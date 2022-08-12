package com.crm.Sdet.campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.BaseClass;
import comcast.vtiger.genericUtilities.ExcelUtility;
import comcast.vtiger.genericUtilities.JavaUtility;
import comcast.vtiger.genericUtilities.PropertyUtlity;
import comcast.vtiger.genericUtilities.WebDriverUtility;
import comcast.vtiger.objectRepository.CampaignPage;
import comcast.vtiger.objectRepository.CampaignValidation;
import comcast.vtiger.objectRepository.CreateCampaignBtn;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;


public class CreateCampaignTest extends BaseClass{
	
	@Test(groups= {"smokeTest","regressionTest"})

	public void createCampaignOnly() throws Throwable {
		 
		 PropertyUtlity plib = new PropertyUtlity();
		 
		 WebDriverUtility wlib= new  WebDriverUtility();
	
		 wlib.waitForPageToLoad(driver);
	
		 WebElement element = driver.findElement(By.xpath("//a[text()='More']"));

		 wlib.mouseOverOnElement(driver,element);
		 
		//homePageRepository
		   HomePage homePage = new HomePage(driver);  
		   homePage.campaignLink();
		
		
		 //Create Campaign Plus btn
		   CreateCampaignBtn camp = new CreateCampaignBtn(driver);
		   camp.createCampaignBtn();
			
			driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();	
			
			//Java Utility
			JavaUtility jlib = new JavaUtility();
			int RanNum = jlib.getRandomNum();
			//Excel Utility
			 ExcelUtility elib = new ExcelUtility();
			String campaignName = elib.getDataFromExcel("Sheet2",3, 0)+RanNum;
			
			  
			  //Campaign Sheet 
			  CampaignPage camp1 =new CampaignPage(driver);
			  camp1.createCampaignName(campaignName);
			  camp1.saveCampaignName();
				
				//driver.findElement(By.name("campaignname")).sendKeys(campaignName);
				//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				//String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				//System.out.println(actData);
				//if(actData.contains(campaignName))
				//{
					//System.out.println("pass");
				//}
				//else
				//{
				//	System.out.println("Fail");
				//}
			  CampaignValidation actualCampaignName = new CampaignValidation(driver);
			  String actualCampaignData = actualCampaignName.actualCampaignName();
			  Assert.assertEquals(actualCampaignData.contains(campaignName), true);
				
			  WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

				
				//a.moveToElement(ele).perform();
			  wlib.mouseOverOnElement(driver, ele);
			  Thread.sleep(3000);
				//driver.findElement(By.linkText("Sign Out")).click();
			   homePage.getSignOutBtn();
				 
			    driver.close();
		}
			
	}


