package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computerspage extends BasePage {
	public Computerspage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement getComputerspage() {
		return getComputerspage();
	}
	
		
	@FindBy(css = "Picture for category Desktops")
	private WebElement Desktops;
	
	

}
