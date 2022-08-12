package com.crm.Sdet.campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
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
import comcast.vtiger.objectRepository.CreateProduct1;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;
import comcast.vtiger.objectRepository.ProductPage;
import comcast.vtiger.objectRepository.ProductPopUp;

public class CreteProdAndCampaignTest extends BaseClass{

	
	
	public void CreteProdAndCampaignTest() throws Throwable {
		
		 
		 
		 //GenericLib methods object creation
         PropertyUtlity plib = new PropertyUtlity();	 
		 WebDriverUtility wlib= new  WebDriverUtility();
		 
		 
		//homePageRepository
		  HomePage homePage = new HomePage(driver);
		  homePage.productLink();
		  
		//Create Product Plus Btn
		  CreateProduct1 prod1 = new CreateProduct1(driver);
		  prod1.createProductBtn();
		  
		//Java Utility Used
		 JavaUtility jlib = new JavaUtility();
		 int RanNum = jlib.getRandomNum();
		 
		 //Excel Utility Used
		 ExcelUtility elib = new ExcelUtility();
		 String prodName = elib.getDataFromExcel("Sheet1",2,0)+RanNum;
		 
		//ProductPage Repository
		 ProductPage prodPage = new ProductPage(driver);
		 prodPage.enterProduct(prodName);
		 prodPage.saveProduct();   
		 System.out.println(prodName);
		 WebElement element = driver.findElement(By.xpath("//a[text()='More']"));

		//mouseOveronElement used
		 wlib.mouseOverOnElement(driver,element);
		 homePage.campaignLink();
		
		//Create Campaign Plus btn
		CreateCampaignBtn camp = new CreateCampaignBtn(driver);
		camp.createCampaignBtn();
		int RanNum1 = jlib.getRandomNum();	
		String campaignName = elib.getDataFromExcel("Sheet2",3, 0)+RanNum1;
				//Campaign Sheet 
		CampaignPage camp1 =new CampaignPage(driver);
		camp1.createCampaignName(campaignName);
				 
		 System.out.println(campaignName);
		 
		//click To select product		
		camp1.clickToSelectProduct();
		
		//Window Switching
		wlib.switchToWindow(driver,"Products&action");
		
		//Product popup
		ProductPopUp prodPopUp = new ProductPopUp(driver);		
		prodPopUp.typeProdname(prodName);
		prodPopUp.searchProdName(driver,prodName);
		//driver.findElement(By.xpath("//a[text()='"+prodName+"']")).click();	
		driver.findElement(By.xpath("//a[@id='1']")).click();
		
		//Window switching
		wlib.switchToWindow(driver,"Campaigns&action");
					
		
		//save campaign
		camp1.saveCampaignName();
					
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
//					
//					if(actData.contains(campaignName))
//					{
//						System.out.println("pass");
//					}
//					else
//					{
//						System.out.println("Fail");
//					}
	    CampaignValidation actualCampaignName = new CampaignValidation(driver);
		String actualCampaignData = actualCampaignName.actualCampaignName();
	     Assert.assertEquals(actualCampaignData.contains(campaignName), true);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

					
		wlib.mouseOverOnElement(driver,ele);
						
		//driver.findElement(By.linkText("Sign Out")).click();
		homePage.getSignOutBtn();
					 
		driver.close();
				
				}
				
			
				
				

	}


