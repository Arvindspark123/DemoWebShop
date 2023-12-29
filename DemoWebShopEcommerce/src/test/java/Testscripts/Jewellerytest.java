package Testscripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import Objectrepository.HomePage;
import Objectrepository.JewelryPage;

public class Jewellerytest extends BaseClass{
	
	@Test
	public void diamondHeartTest_001() {
		HomePage homePage = new HomePage(driver);
		JewelryPage j=new JewelryPage(driver);
		//Takes ScreenShot of Web Page
		getScreenshotOfWebPage(driver);
		
		//Click on Jewelry
		clickElement(homePage.getJewelryLink());
		
		//Takes Screenshot on Diamond Heart
		getScreenshotOfWebElement(j.getBlackAndWhiteDiamondHeartImage());
		
	//	String str = "hi";
		
	}

}