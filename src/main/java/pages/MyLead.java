package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLead extends OpentapsWrappers{

	public MyLead() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	

	public CRMHomePage clickCreateLead() {
		clickByLink(prop.getProperty("MyLeads.Createlead.Link"));
		return new CRMHomePage();
	}


	public FindLeadHomepage clickFindleadslink() {
		clickByLink(prop.getProperty("MyLeads.Findlead.Link"));
					return new FindLeadHomepage();
	}

	public MergeLeadHomepage clickMergeleadslink() {
		clickByLink(prop.getProperty("MyLeads.Mergelead.Link"));
					return new MergeLeadHomepage();
	}
	
	
	
}