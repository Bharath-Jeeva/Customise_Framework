package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsNewWindow extends OpentapsWrappers{

	public FindLeadsNewWindow() {
		if(!verifyTitle("Find Leads"))
			Reporter.reportStep("This is not Findlead NEw Tab Home Page", "FAIL");
	}	



	public FindLeadsNewWindow  enterFirstnameinnewwindow (String data) {
		enterByXpath(prop.getProperty("FindLEadNewwindow.EnterFirstname.Xpath"),data);
		return this;

}
	

	

	public FindLeadsNewWindow   clickFindleadsButton () {
		clickByXpath(prop.getProperty("FindLEadNewwindow.FindLeadsButton.Xpath"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public MergeLeadHomepage clickFindleadRecord ()  {
		clickByXpath(prop.getProperty("FindLeadHomepage.ClickFirstFindLeadrecord.Xpath"));
		switchToParentWindow();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MergeLeadHomepage();
	}
	
	
	
}