package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadHomepage extends OpentapsWrappers{

	public MergeLeadHomepage() {
		if(!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	



	public FindLeadsNewWindow clickFirstLeadtbutton() {
		clickByXpath(prop.getProperty("MergeLead.ClickFristLeadButton.Xpath"));
		
		switchToLastWindow();
		
		return new FindLeadsNewWindow();

}

	public FindLeadsNewWindow clickSecondLeadtbutton () {
		
clickByXpath(prop.getProperty("MergeLead.ClickSecondLeadButton.Xpath"));
		
		switchToLastWindow();
		
		return new FindLeadsNewWindow();

}
	public ViewLead clickmergetbutton() {
		
		clickByXpathWoRprt(prop.getProperty("MergeLead.clickMergeButton.Xpath"));
		
		acceptAlert();
		return new ViewLead();

}
	
	public FindLeadHomepage clickFindleadslink() {
		clickByLink(prop.getProperty("MyLeads.Findlead.Link"));
		return new FindLeadHomepage();
	}
	
	
	
}