package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {

	public ProductListingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'single_add_to_cart_button button alt disabled wc-variation-selection-needed')]")
	private WebElement btn_AddToCart;

	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='noo-product-inner']"))
	private List<WebElement> prd_List;

	public void clickOn_AddToCart() {
		btn_AddToCart.click();
	}

	public void select_Product(int productNumber) {
		prd_List.get(productNumber).click();
	}

}