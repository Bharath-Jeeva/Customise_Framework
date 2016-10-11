package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser,String companyName, String firstName, String lastName,String FirstNamedata, String Updatadata) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.clickFindleadslink()
		.EnterFirstName(FirstNamedata)
		.clickFindleadsButton()
	
		.clickFindleadRecord()
		.clickEditbutton()
		.selectupdatadata(Updatadata)
		.clickupdatebutton();

	}


	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="EditLead";
		testDescription="Login and Create and Edit Lead in Opentaps using POM framework";

	}




}
