package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	


	public CRMHomePage enterCompanyName(String data) {
		enterById(prop.getProperty("CRMHomePage.CompanyName.Id"), data);
		return this;
	}



	public CRMHomePage enterFirstName(String data) {
		enterById(prop.getProperty("CRMHomePage.FirstName.Id"), data);
		return this;
	}




	public CRMHomePage enterLastName(String data) {
		enterById(prop.getProperty("CRMHomePage.LastName.Id"), data);
		return this;
	}

	public ViewLead clickCreateLeadButton() {
		clickByClassName(prop.getProperty("CRMHomePage.createLeadbutton.Classsname"));
		return new ViewLead();
	}
	
	public FindLeadHomepage clickFindLeadButton() {
		clickByClassName(prop.getProperty("CRMHomePage.createLeadbutton.Classsname"));
		return new FindLeadHomepage();
	}
	public CRMHomePage clickCreateLeadForFailure() {
		clickByClassName(prop.getProperty("CRMHomePage.createLeadbutton.Classsname"));
		return this;

	}
	public CRMHomePage verifyCreateLeadErrorMessage(String data) {
		verifyTextContainsByXpath(prop.getProperty("CRMHomePage.error.Classname"), data);
		return this;
	}

}
