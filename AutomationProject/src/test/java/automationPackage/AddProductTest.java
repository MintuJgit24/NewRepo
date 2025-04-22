package automationPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddProductPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddProductTest extends Base{
  @Test
  public void addProduct() throws IOException {
	  String username=ExcelUtility.getStringData(0, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswordOnPasswordField(password);
	  login.clickSignInButton();
	  
	  AddProductPage product=new AddProductPage(driver);
	  product.clickManageProduct();
	  product.clickNewBtn();
	  product.enterTitle();
	  product.selectProductType();
  }
}
