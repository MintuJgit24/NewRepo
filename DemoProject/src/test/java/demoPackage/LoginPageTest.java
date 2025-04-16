package demoPackage;

import java.io.IOException;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginPageTest extends Base{
	
	
  @Test(description="verify whether user is able to login with valid credentials")
  public void verifyEnterUsernamePassword() throws IOException {
	  //verifyEnterUsernamePassword=testcase name
	  //verifyLoginWithValidCredentials
	  //consider 4 testcases
	  
	  String username=ExcelUtility.getStringData(0, 0, "LoginPage");
	  String pswd=ExcelUtility.getStringData(0, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUserNameOnUserNameField(username);
	  login.enterPasswordOnPasswordField(pswd);
	  login.clickLogin();
	  
  }
  @Test
  public void verifyLoginWithInvalidUsernamePswd() throws IOException {
	  
	  String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	  String pswd=ExcelUtility.getStringData(1, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUserNameOnUserNameField(username);
	  login.enterPasswordOnPasswordField(pswd);
	  login.clickLogin();
	  
	  
  }
  @Test
  public void verifyLoginWithValidUsernameInvalidPswd() throws IOException {
	  String username=ExcelUtility.getStringData(2, 0, "LoginPage");
	  String pswd=ExcelUtility.getStringData(2, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUserNameOnUserNameField(username);
	  login.enterPasswordOnPasswordField(pswd);
	  login.clickLogin();
	  
  }
  
  @Test
  public void verifyLoginWithInvalidUsernameInvalidPswd() throws IOException {
	  String username=ExcelUtility.getStringData(3, 0, "LoginPage");
	  String pswd=ExcelUtility.getStringData(3, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUserNameOnUserNameField(username);
	  login.enterPasswordOnPasswordField(pswd);
	  login.clickLogin();
	  
  }
  
  
}
