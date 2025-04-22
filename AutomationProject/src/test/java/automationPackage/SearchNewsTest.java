package automationPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddNewsPage;
import pages.LoginPage;
import pages.SearchNewsPage;
import utilities.ExcelUtility;

public class SearchNewsTest extends Base{
  @Test(description="verify whether user is able to search news")
  public void searchNews() throws IOException {
	  String username=ExcelUtility.getStringData(0, 0, "LoginPage");
	  String password=ExcelUtility.getStringData(0, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterPasswordOnPasswordField(password);
	  login.clickSignInButton();
	  
	  AddNewsPage news=new AddNewsPage(driver);
	  news.clickManageNews();
	  
	  SearchNewsPage searchNews=new SearchNewsPage(driver);
	  searchNews.clickSearchBtnMain();
	  searchNews.enterNewsTitle();
	  searchNews.clickSearchBtnSmall();
  }
}
