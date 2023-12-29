package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
		

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy (linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Log out")
    private WebElement logoutLink;	
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	

	@FindBy (partialLinkText ="Shopping")
	private WebElement shoppingcartLink ;
	
	@FindBy (partialLinkText = "Wishlist")
	private WebElement wishlistLink;
	
	@FindBy (id="small-searchterms")
	private WebElement searchTextField;

	@FindBy (partialLinkText = "jewelry")
	private WebElement jewelryLink;

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	}


