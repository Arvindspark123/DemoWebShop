package Objectrepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import GenericLibrary.FileUtility;

public class LoginPage extends BasePage{
	
	
	


	public LoginPage(WebDriver driver) {
		super(driver);
	}


	public void login(WebDriver driver) {
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage=new LoginPage(driver);
		
		//Click on login link
		homepage.getLoginLink().click();
	}
	
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}
	public WebElement getForgetPasswordlink() {
		return forgetPasswordlink;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	@FindBy(id = "Email") 
    private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;

	@FindBy(linkText = "Forget password?")
	private WebElement forgetPasswordlink;

	@FindBy(css = "[value='Log in']")
    private WebElement loginButton;

	//used to login from the application

	public void Login(WebDriver driver) throws Exception {

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

	//used to logout from the application
    public void logOut (WebDriver driver) {
       HomePage  homepage = new HomePage(driver);

		//click on Log out link
        homepage.getLogoutLink().click();

	}

}

