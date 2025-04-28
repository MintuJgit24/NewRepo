package automationPackage;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
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
		boolean successAlert=subCategory.succesAlertAfterAddingSubCategory();
		Assert.assertSame(true,successAlert,Constant.ERR_MSG_ALERT_AFTER_ADDING_SUBCATEGORY);
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
		
		String expected=".........RESULT NOT FOUND.......";
		String actual=subCategory.getTableValue();
		//System.out.println(actual);
		boolean searchResult=true;
		if(actual.equals(expected)) {
			searchResult=false;
			Assert.assertFalse(searchResult,Constant.ERR_MSG_SUBCATEGORY_FOUND);
		}
		else {
			Assert.assertTrue(searchResult, Constant.ERR_MSG_SUBCATEGORY_NOT_FOUND);
		}
	}
}
