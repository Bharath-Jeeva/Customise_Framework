package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC006_DeleteLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser,String Firstname, String Leadid,String verifytext) {
System.out.println(Leadid);
		new LoginPage()

		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLead()
		.clickFindleadslink()
		.EnterFirstName(Firstname)
		.clickFindleadsButton()
		.clickFindleadRecord()
		.clickDeleteLead()
		.clickFindleadslink()
		//.EnterFirstName(Firstname)
		.EnterLeadID(Leadid)
		.clickFindleadsButton()
		.VerifyTextofNoRecordDisplay(verifytext);



	}


	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC006";
		browserName="chrome";
		testCaseName="DeleteLead";
		testDescription="Login and Create and Delete Lead in Opentaps using POM framework";

	}




}
