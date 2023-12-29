package GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import Objectrepository.HomePage;
import Objectrepository.LoginPage;

public class BaseClass  extends webDriverUtility{
	public WebDriver driver;
	@BeforeSuite
	public void beforesuite() {
		report=new ExtentReports(Report_Path+getSystemDate()+".html");
		Reporter.log("Connecting to the database",true);
		
	}
    @AfterSuite
    public void aftersuite() {
    	report.flush();
    	Reporter.log("Close connection to the database",true);
    	
    }
    @BeforeTest
    public void beforetest() {
    	Reporter.log("BeforeTest",true);
    	
    }
    @AfterTest
    public void aftertest() {
    	Reporter.log("AfterTest",true);
    	
    }

    @BeforeClass 
	public void beforeclass () throws Exception {

			Reporter. log ("Before class", true);

			String browser=FileUtility. getproperty("browser");

			String url=FileUtility.getproperty("url");

			

			if (browser. equalsIgnoreCase ("chrome")){

			driver=new ChromeDriver();			

			}

			else if (browser.equalsIgnoreCase ("edge")) {

			driver=new EdgeDriver();

			}

			else if (browser.equalsIgnoreCase ("firefox")) {

			driver=new FirefoxDriver ();

			}

			else {

				driver=new ChromeDriver();

			}

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get(url);

	}
    @AfterClass
    public void afterclass() {
    	Reporter.log("Close the browser",true);
    	driver.quit();
    }

			

			

	@BeforeMethod

	public void beforeMethod() throws Exception {
		
		

		Reporter.log("Login");

		HomePage homepage = new HomePage(driver);

		LoginPage loginpage = new LoginPage(driver);

		

		//click on login link

		homepage.getLoginLink().click();

		

		//enter the email

		loginpage.getEmailTextField().sendKeys(FileUtility.getproperty("email"));

		

		//enter password

		loginpage.getPasswordTextField().sendKeys(FileUtility.getproperty("password"));

		

		//click on remember me checkbox

		loginpage.getRememberMeCheckBox().click();

		

		//click on login button

		loginpage.getLoginButton().click();

		

	}

	@AfterMethod

	public void aftermethod () {

	Reporter. log ("Log out");

	driver. findElement (By. linkText ("Log out")).click();



	}

}


