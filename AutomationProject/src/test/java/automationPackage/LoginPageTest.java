package automationPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginPageTest extends Base {
  @Test(priority = 1, description="verify whether user is able to login with valid credentials")
  public void verifyUserLoginWithValidCredentials() throws IOException {
	  String username=ExcelUtility.getStringData(0, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	  
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswordOnPasswordField(password);
	  login.clickSignInButton();
	  boolean isHomePageDispalyed=login.isDashboardDisplayed();//to verify tc passes, this comes if tc passes
	  Assert.assertTrue(isHomePageDispalyed, "Home page is not loaded.");//if home page not loaded this msg prints and TC failed
	  //Assert.assertFalse(isHomePageDispalyed, "Home page is loaded");   
  }
  
  @Test(priority = 2, description="verify whether user is able to login with invalid username and valid password")
  public void verifyUserLoginWithInvalidUserNameAndValidPassword() throws IOException {
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(1, 1, "LoginPage");
	  
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswordOnPasswordField(password);
	  login.clickSignInButton();
	  boolean isLoginBoxDisplayed=login.isLoginBoxDisplayed();
	  Assert.assertTrue(isLoginBoxDisplayed, "Home page is loaded.");
  }
  
  @Test(priority = 3, description="verify whether user is able to login with valid username and invalid password")
  public void verifyUserLoginWithValidUserNameAndInvalidPassword() throws IOException {
	  String username=ExcelUtility.getStringData(2, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(2, 1, "LoginPage");
	  
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswordOnPasswordField(password);
	  login.clickSignInButton();
	  boolean isLoginBoxDisplayed=login.isLoginBoxDisplayed();
	  Assert.assertTrue(isLoginBoxDisplayed, "Home page is loaded.");
  }
  
  @Test(priority = 4, description="verify whether user is able to login with invalid username and invalid password")
  public void verifyUserLoginWithInvalidUserNameAndInvalidPassword() throws IOException {
	  String username=ExcelUtility.getStringData(3, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(3, 1, "LoginPage");
	  
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswordOnPasswordField(password);
	  login.clickSignInButton();
	  boolean isLoginBoxDisplayed=login.isLoginBoxDisplayed();
	  Assert.assertTrue(isLoginBoxDisplayed, "Home page is loaded.");
  }
}
