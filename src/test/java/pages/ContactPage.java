package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ContactPage extends TestBase {
	@FindBy(xpath="//button[contains(text(), 'Create')]")
	WebElement createBtn;
	
	@FindBy(name = "first_name")
	WebElement firstName;
	
	@FindBy(name = "last_name")
	WebElement lastName;
	
	@FindBy(xpath="//button[contains(text(), 'Save')]")
	WebElement saveBtn;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public void createContact(String strfirstName, String strlastName) {
		createBtn.click();
		driver.navigate().refresh();
		firstName.sendKeys(strfirstName);
		lastName.sendKeys(strlastName);
		saveBtn.click();
		
	}
	public void editContact() {
		
	}
	
}
