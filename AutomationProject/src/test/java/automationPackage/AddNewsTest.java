package automationPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AddNewsPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddNewsTest extends Base {
	public HomePage homePage;
	public AddNewsPage news;

	@Test(description = "verify whether user is able to add news" , retryAnalyzer = retryPackage.Retry.class)
	public void addNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		// login.enterPasswordOnPasswordField(password);
		homePage = login.clickSignInButton();

		// AddNewsPage news=new AddNewsPage(driver);
		news = homePage.clickManageNews();
		news.clickNewBtn().enterNews().clickSaveBtn();
		// news.enterNews();
		// news.clickSaveBtn();

		Boolean alertPresent = news.isAlertCameonSaveNews();
		Assert.assertTrue(alertPresent, Constant.ERR_MSG_ALERT_AFTER_ADDING_NEWS);

	}
}
