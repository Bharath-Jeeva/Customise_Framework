package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC005_MergeLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, String vUser,String firstleadname,String Secondleadname,String companyName,String firstName, String lastName,String verifytext) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()
		.clickMergeleadslink()
		.clickFirstLeadtbutton()
		.enterFirstnameinnewwindow(firstleadname)
		.clickFindleadsButton()
		.clickFindleadRecord()
		.clickSecondLeadtbutton()
		.enterFirstnameinnewwindow(Secondleadname)
		.clickFindleadsButton()
		.clickFindleadRecord()
		.clickmergetbutton()
		.clickFindleadslink()
		
		.EnterFirstName(firstName)
		.EnterLastName(lastName)
		.EnterCompanyName(companyName)
		.clickFindleadsButton()
		.VerifyTextofNoRecordDisplay(verifytext);
		.VerifyStringoFNoRecordDisplay(verifytext);


	}


	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="MergeLead";
		testDescription="Login and Merge Lead in Opentaps using POM framework";

	}




}
