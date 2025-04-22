package automationPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base {
	@Test(priority = 1, description="verify whether user is able to add subcategory")
	public void createSubCategory() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();

		SubCategoryPage subCategory = new SubCategoryPage(driver);
		subCategory.clickMoreInfo();
		subCategory.clickNewBtn();
		subCategory.selectCategoryFromDropDown();
		subCategory.enterSubCategory();
		subCategory.chooseImage();
		subCategory.clickSaveBtn();

	}

	@Test(priority = 2, description="verify whether user is able to search subcategory")
	public void searchSubCategory() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickSignInButton();

		SubCategoryPage subCategory = new SubCategoryPage(driver);
		subCategory.clickMoreInfo();
		subCategory.clickSearchBtnMain();
		subCategory.selectSearchCategory();
		subCategory.enterSearchSubCategory();
		subCategory.clickSearchBtnSmall();
	}
}
