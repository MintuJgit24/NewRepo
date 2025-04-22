package automationPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends Base {

	@Test(description = "verify whether user is able to login to homepage and logout ")
	public void verifyUserLogout() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();

		HomePage home = new HomePage(driver);
		home.clickUserNameLink();
		home.clickLogout();
		//ASSERTION for checking expected and actual result is matching or not.
		String expected="Login | 7rmart supermarket";
		String actual=driver.getTitle();
		//System.out.println("actual title"+actual);
		Assert.assertEquals(expected, actual,"Logout is unsuccessful");
	}
}
