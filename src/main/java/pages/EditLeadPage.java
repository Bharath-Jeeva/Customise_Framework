package pages;



import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{

	public EditLeadPage(){

		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not EDit Lead Page", "FAIL");
	}

	public EditLeadPage selectupdatadata(String data) {
		selectById(prop.getProperty("Editlead.selectEditdata.Id"), data);
		return this;
	}

	public ViewLead clickupdatebutton() {
		clickByClassName(prop.getProperty("Editlead.clickupdatebutton.Classname"));
		return new ViewLead();
	}

	}

	








