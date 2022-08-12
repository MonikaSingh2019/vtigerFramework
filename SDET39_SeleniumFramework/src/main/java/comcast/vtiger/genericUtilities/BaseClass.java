package comcast.vtiger.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import comcast.vtiger.objectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public WebDriver driver;
	public static WebDriver sDriver;
	PropertyUtlity plib = new PropertyUtlity();
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	
	public void BS()
	{
		System.out.println("Database Connection");
	}
	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void Bt()
	{
		System.out.println("Execute Script In parallel Mode");
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void BC() throws Throwable
	{
		System.out.println("Launching Browser..........I am In Before Class");
		
		 String Browser = plib.getPropertyKeyVAlue("browser");
		  if(Browser.equalsIgnoreCase("chrome"))
		  {
		   
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();

		  }
		   else if(Browser.equalsIgnoreCase("firefox"))
		  {
		   WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		  }
		  else if(Browser.equalsIgnoreCase("edge"))
		   {
		   WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		   }
		   else
		   {
		     driver = new ChromeDriver();
		   }
			
			sDriver = driver;
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void BM() throws Throwable
	{
		System.out.println("Login Credentials-----BM");
		driver.manage().window().maximize();
		String Url=plib.getPropertyKeyVAlue("url");
		String UN=plib.getPropertyKeyVAlue("un");
		String PW=plib.getPropertyKeyVAlue("pw");
		driver.get(Url);
		//LoginpageRepository
	    LoginPage loginPage = new LoginPage(driver);
		loginPage.login(UN, PW);
	
	}
	
	
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void AM()
	{
		System.out.println("Logout from application");
		//driver.quit();
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void AC()
	{
		System.out.println("Closing the BROWSER");
	}
	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void AT()
	{
		System.out.println("Parallel execution is done");
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void AS()
	{
		System.out.println("Closes the database connection");
	}
}
