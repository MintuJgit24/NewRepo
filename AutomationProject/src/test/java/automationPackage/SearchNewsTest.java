package automationPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AddNewsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchNewsPage;
import utilities.ExcelUtility;

public class SearchNewsTest extends Base {
	public HomePage homePage;
	public AddNewsPage news;
	public SearchNewsPage searchNews;

	@Test(description = "verify whether user is able to search news")
	public void searchNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		// login.enterPasswordOnPasswordField(password);
		// login.clickSignInButton();
		homePage = login.clickSignInButton();

		// AddNewsPage news=new AddNewsPage(driver);
		// news.clickManageNews();
		news = homePage.clickManageNews();
		// SearchNewsPage searchNews=new SearchNewsPage(driver);
		searchNews = news.clickSearchBtnMain();
		searchNews.enterNewsTitle();
		searchNews.clickSearchBtnSmall();

		String expected = ".........RESULT NOT FOUND.......";
		String actual = searchNews.getTableValue();
		// System.out.println(actual);

		boolean showResults = true;
		if (actual.equals(expected)) {
			showResults = false;
			Assert.assertFalse(showResults, Constant.ERR_MSG_NEWS_FOUND);
		} else {
			Assert.assertTrue(showResults, Constant.ERR_MSG_NEWS_NOT_FOUND);
		}
	}
}
