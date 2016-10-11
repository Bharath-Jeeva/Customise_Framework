package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	

	public MyLead clickLead() {
		clickByLink(prop.getProperty("CreateLeadPage.Leads.Link"));
		return new MyLead();
	}
	
	












}
