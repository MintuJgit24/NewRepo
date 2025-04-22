package automationPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddNewsPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddNewsTest extends Base{
  @Test(description="verify whether user is able to add news")
  public void addNews() throws IOException {
	  String username=ExcelUtility.getStringData(0, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswordOnPasswordField(password);
	  login.clickSignInButton();
	  
	  AddNewsPage news=new AddNewsPage(driver);
	  news.clickManageNews();
	  news.clickNewBtn();
	  news.enterNews();
	  news.clickSaveBtn();
  }
}
