package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaptolHomePage {
	
	@FindBy (xpath = "//a[@id='login-panel-link']")private WebElement logIn;
	@FindBy (xpath = "//a[text()='Track Order']") private WebElement trackOrder;
	@FindBy (xpath = "(//div[@class='searchBox'])[2]") private WebElement searchProduct;
	@FindBy (xpath = "(//a[@href='javascript:autoSuggestion.headerSearch()'])[2]")private WebElement search;
	@FindBy (xpath = "//div[@class='cate_head']") private WebElement shoppingCategories;
	@FindBy (xpath = "(//a[@href='#ShoppingCartBox'])[2]")private WebElement cartItems;
	@FindBy (xpath = "//div[@id='mainMenuContent']//ul//li[1]//a//span") private WebElement listShoppingCategories;
	@FindBy (xpath = "//div[@id='grid']") private List<WebElement> productList;
	@FindBy (xpath = "//div[@id='fancybox-inner-id-for-quick-view']") private WebElement loginPopup;
	@FindBy (xpath = "//article[@id='staticContent']") private WebElement trackOrderPage;
	
	
	public NaptolHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickOnLogin () {
		logIn.click();
	}
	public void clickOnTrackOrder() {
		trackOrder.click();
	}
	public void enterProductInSearchProduct(String product) {
		searchProduct.sendKeys(product);
	}
	public void clickOnSearch() {
		search.click();
	}
	public void viewShoppingCategory(WebDriver driver) {
		Actions action =new Actions(driver);
		action.moveToElement(shoppingCategories);
		action.perform();
	}
	public void viewCartItems() {
		cartItems.click();
	}
	public boolean isListItemDisplayed() {
		return listShoppingCategories.isDisplayed();
	}
	public int  getNumberOfProductDisPlayed() {
		return productList.size();
	}
	public boolean isLoginPopupDisplayed() {
		return loginPopup.isDisplayed();
	}
	public boolean isTrackOrderPageDisplayed() {
		return trackOrderPage.isDisplayed();
	}

}
