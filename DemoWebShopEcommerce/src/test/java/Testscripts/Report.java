package Testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	ExtentReports report=new ExtentReports("./Reports/reports.html");
	 ExtentTest test=report.startTest("loginTest");
	 @Test
	 public void reportTest() {
		 WebDriver driver=new ChromeDriver();
		 test.log(LogStatus.INFO, "Chrome Browser Launched");
		 
		 driver.manage().window().maximize();
		 test.log(LogStatus.INFO, "Chrome browser maximized");
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[.='Log in']")).click();
		 
		 driver.findElement(By.id("Email")).sendKeys("arvindspark2001@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("arvind@123");
		 driver.findElement(By.cssSelector("[value='Log in']")).click();
		 
		 Assert.assertEquals(driver.findElement(By.linkText("Log out")).isDisplayed(), true,"log out not displayed");
		 test.log(LogStatus.PASS, "login successful");
		 
		 report.endTest(test);
		 report.flush();
		 
		 driver.quit();

	 }
}
