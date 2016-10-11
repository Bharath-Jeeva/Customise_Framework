package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLead extends OpentapsWrappers{

	public ViewLead() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	



	public EditLeadPage clickEditbutton () {
		clickByXpath(prop.getProperty("viewLead.ClickEditButton.Xpath"));
		return new EditLeadPage();

}

	public FindLeadHomepage clickFindleadslink() {
		clickByLink(prop.getProperty("MyLeads.Findlead.Link"));
		return new FindLeadHomepage();
	}

	public MyLead clickDeleteLead() {
		clickByLink(prop.getProperty("viewLead.clickDeletebutton.Link"));
		return new MyLead();

	}
}