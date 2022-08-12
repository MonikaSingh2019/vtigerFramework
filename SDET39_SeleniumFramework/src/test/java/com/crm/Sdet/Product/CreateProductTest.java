package com.crm.Sdet.Product;

import java.io.FileInputStream;
import java.io.IOException;
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
import comcast.vtiger.objectRepository.CreateProduct1;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;
import comcast.vtiger.objectRepository.ProductPage;
import comcast.vtiger.objectRepository.ProductValidation;


@Test(retryAnalyzer = comcast.vtiger.genericUtilities.ReTryImpClass.class)
public class CreateProductTest extends BaseClass {

	
	
	//@Test(groups= {"regressionTest"})

	public void createProductOnly() throws Throwable {
		
		
		
         PropertyUtlity plib = new PropertyUtlity();
		 WebDriverUtility wlib = new WebDriverUtility();
	
		 //WebDriverUtility used
		 wlib.waitForPageToLoad(driver);
		   
		 //homePageRepository
		 HomePage homePage = new HomePage(driver);
		 homePage.productLink();
		
		 //Create Product Plus Btn
		  CreateProduct1 prod1 = new CreateProduct1(driver);
		  prod1.createProductBtn();
		  
		  
		  //willingly failing
		  // Assert.assertEquals(false, true);
		 //Java Utility
		 JavaUtility jlib = new JavaUtility();
		 int RanNum = jlib.getRandomNum();
		 
		 //Excel Utility
		 ExcelUtility elib = new ExcelUtility();
		 String prodName = elib.getDataFromExcel("Sheet2",1,0)+RanNum;
		 //ProductPage Repository
		 ProductPage prodPage = new ProductPage(driver);
		 prodPage.enterProduct(prodName);
		 prodPage.saveProduct();
		 
		 System.out.println(prodName);
			
			
			//String actData = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
			
			//if(actData.contains(prodName))
			//{
			//	System.out.println("pass");
			//}
			//else
			//{
			//	System.out.println("Fail");
			//}
			
		 ProductValidation actualProductName = new ProductValidation(driver);
		 String actualProductData = actualProductName.actualProductName();
		 Assert.assertEquals(actualProductData.contains(prodName), true);
		 
		 
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

			//WebDriver Utility used
			wlib.mouseOverOnElement(driver, element);
				
			//home Repository for sign out	
			//driver.findElement(By.linkText("Sign Out")).click();
              homePage.getSignOutBtn();
			 
			 driver.close();
			 
	}

}
