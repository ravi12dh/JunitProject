package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.toggleAllFunctionality;
import util.BrowserFactory;

public class toggleAllFunctionalitytest {

	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToCreateCustomer() {
		
		driver = BrowserFactory.init();
		
		toggleAllFunctionality AllFunctionality = PageFactory.initElements(driver, toggleAllFunctionality.class);
		AllFunctionality.interAddField("maven123");
		AllFunctionality.clickAddButton();
		AllFunctionality.interAddField("maven1234");
		AllFunctionality.clickAddButton();
		AllFunctionality.interAddField("maven12325");
		AllFunctionality.clickAddButton();
		AllFunctionality.clickOnListItem();
		AllFunctionality.clickRemoveButton();
		AllFunctionality.toggleRadioButton();
		AllFunctionality.clickRemoveButton();
		  
		
	}
}