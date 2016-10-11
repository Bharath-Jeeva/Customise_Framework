package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadHomepage extends OpentapsWrappers{

	public FindLeadHomepage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Lead Page", "FAIL");
	}	

	public FindLeadHomepage EnterLeadID (String data) {
		enterByXpath(prop.getProperty("FindLeadHomepage.EnterLeadID.Xpath"), data);
		return this;
	}
	
	public FindLeadHomepage VerifyTextofNoRecordDisplay (String data) {
		verifyTextContainsByXpathwithwait(prop.getProperty("FindLeadHomepage.VerifyTextofNorecordDisplay.Xpath"), data);
		return this;
	}
	
	public FindLeadHomepage EnterFirstName (String data) {
		enterByXpath(prop.getProperty("FindLeadHomepage.Firstname.Xpath"), data);
		return this;
	}
	
	public FindLeadHomepage EnterLastName (String data) {
		enterByXpath(prop.getProperty("FindLeadHomepage.Lastname.Xpath"), data);
		return this;
	}
	public FindLeadHomepage EnterCompanyName (String data) {
		enterByXpath(prop.getProperty("FindLeadHomepage.Companyname.Xpath"), data);
		return this;
	}
	
	

	public FindLeadHomepage clickFindleadsButton () {
		clickByXpath(prop.getProperty("FindLeadHomepage.FindLeadsButton.Xpath"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public ViewLead clickFindleadRecord () {
		String firstlead=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		System.out.println(firstlead);
		clickByXpath(prop.getProperty("FindLeadHomepage.ClickFirstFindLeadrecord.Xpath"));
		return new ViewLead();
	}
}