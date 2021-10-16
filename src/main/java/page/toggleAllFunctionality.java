package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class toggleAllFunctionality {

	WebDriver driver;

	@FindBy(how = How.NAME, using = "data")
	WebElement ADD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement ClICK_ADDBUTTON_FIELD;
	@FindBy(how = How.NAME, using = "allbox")
	WebElement TOGGLE_RADIOBUTTON_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement REMOVE_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")
	WebElement CLICK_ON_A_LISTITEM_FIELD;
	
	public void interAddField(String str) {
		ADD_FIELD_LOCATOR.sendKeys(str);
	}
	public void clickOnListItem() {
		CLICK_ON_A_LISTITEM_FIELD.click();
	}

	public void clickAddButton() {
		ClICK_ADDBUTTON_FIELD.click();
	}

	public void toggleRadioButton() {
		TOGGLE_RADIOBUTTON_FIELD.click();
	}

	public void clickRemoveButton() {
		REMOVE_FIELD_LOCATOR.click();
	}

	
}
