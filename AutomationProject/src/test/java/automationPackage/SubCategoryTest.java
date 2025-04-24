package automationPackage;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base {
	
	public HomePage homePage;
	public SubCategoryPage subCategory;
	
	@Test(priority = 1, description="verify whether user is able to add subcategory")
	public void createSubCategory() throws IOException, AWTException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		//login.enterPasswordOnPasswordField(password);
		homePage=login.clickSignInButton();
		subCategory=homePage.clickMoreInfo();
		subCategory.clickNewBtn().selectCategoryFromDropDown().enterSubCategory().chooseImage().clickSaveBtn();
		//SubCategoryPage subCategory = new SubCategoryPage(driver);
		//subCategory.clickMoreInfo();
		//subCategory.clickNewBtn();
		//subCategory.selectCategoryFromDropDown();
		//subCategory.enterSubCategory();
		//subCategory.chooseImage();
		//subCategory.clickSaveBtn();

	}

	@Test(priority = 2, description="verify whether user is able to search subcategory")
	public void searchSubCategory() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		//login.enterPasswordOnPasswordField(password);
		homePage=login.clickSignInButton();
		subCategory=homePage.clickMoreInfo();
		subCategory.clickSearchBtnMain().selectSearchCategory().enterSearchSubCategory().clickSearchBtnSmall();
		//SubCategoryPage subCategory = new SubCategoryPage(driver);
		//subCategory.clickMoreInfo();
		//subCategory.clickSearchBtnMain();
		//subCategory.selectSearchCategory();
		//subCategory.enterSearchSubCategory();
		//subCategory.clickSearchBtnSmall();
	}
}
