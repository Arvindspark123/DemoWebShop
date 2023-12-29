package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookspage extends BasePage {
	public Bookspage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement getBooksPageHeading() {
		return getBooksPageHeading();
	}
	
	@FindBy(xpath = "//div[@class='page-title']//h1")
	private WebElement booksPageheading;
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement pageSizedropdown;
	
	@FindBy(id = "products-viewmode")
	private WebElement viewByDropdown;

	public WebElement getBooksPageheading() {
		return booksPageheading;
	}
	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}
	public WebElement getPageSizedropdown() {
		return pageSizedropdown;
	}
	public WebElement getViewByDropdown() {
		return viewByDropdown;
	}
	
	

}
