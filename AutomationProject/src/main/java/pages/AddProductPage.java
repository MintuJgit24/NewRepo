package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPage {
public WebDriver driver;
	
	public AddProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Manage Product']")private WebElement manageProduct;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newBtn;
	@FindBy(xpath="//input[@id='title']")private WebElement enterTitle;
	@FindBy(xpath="(//input[@type='radio'])[3]")private WebElement productType;
	
	public void clickManageProduct() {
		manageProduct.click();
	}
	
	public void clickNewBtn() {
		newBtn.click();
	}
	
	public void enterTitle() {
		enterTitle.sendKeys("Test Product");
	}
	
	public void selectProductType() {
		productType.click();
	}

}
