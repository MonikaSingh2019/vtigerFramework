package com.crm.Sdet.organization;

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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtilities.BaseClass;
import comcast.vtiger.genericUtilities.ExcelUtility;
import comcast.vtiger.genericUtilities.JavaUtility;
import comcast.vtiger.genericUtilities.PropertyUtlity;
import comcast.vtiger.genericUtilities.WebDriverUtility;
import comcast.vtiger.objectRepository.CampaignValidation;
import comcast.vtiger.objectRepository.CreateOrganization;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;
import comcast.vtiger.objectRepository.OrganizationPage;
import comcast.vtiger.objectRepository.OrganizationValidation;


@Listeners(comcast.vtiger.genericUtilities.ListenersImplementationClass.class)
public class CreateOrganization1Test extends BaseClass {
	@Test(groups= {"smokeTest"})

	public void createOrganisation() throws Throwable {
		
		//Generic Utilities
		 PropertyUtlity plib = new PropertyUtlity();
		 WebDriverUtility wlib= new  WebDriverUtility();
		 wlib.waitForPageToLoad(driver);
		 
		   //homePageRepository
		   HomePage homePage = new HomePage(driver);
		   homePage.organizationLink();
		   
		   //CreateOrganization
		   
		   CreateOrganization org = new CreateOrganization(driver);
		   org.createOrganizationBtn();
		   //willingly failing
		   //Assert.assertEquals(false, true);
		   
		   //Java utility used
		   JavaUtility jlib = new JavaUtility();
		   int RanNum = jlib.getRandomNum();
		   
		   //Excel utility used
		   ExcelUtility elib = new ExcelUtility();
		   String orgName = elib.getDataFromExcel("Sheet1",2,0)+RanNum;
		   System.out.println(orgName);
		   
              //CreateOrganizationPage
		   
		   OrganizationPage orgPage = new OrganizationPage(driver);
		   orgPage.createOrganization(orgName);
		   orgPage.saveOrg();
		   
		  
			
//			String actData = driver.findElement(By.className("dvHeaderText")).getText();
//			System.out.println(actData);
//			if(actData.contains(orgName))
//			{
//				System.out.println("pass");
//			}
//			else
//			{
//				System.out.println("Fail");
//			}

			OrganizationValidation actualOrgName = new OrganizationValidation(driver);
			String actualOrgData = actualOrgName.actualOrgName();
			Assert.assertEquals(actualOrgData.contains(orgName), true);
			
			WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
            //WebDriver Utility used
			wlib.mouseOverOnElement(driver, element);
	
             //homePagerepository
			homePage.getSignOutBtn();
			 driver.close();
	}
	

}
