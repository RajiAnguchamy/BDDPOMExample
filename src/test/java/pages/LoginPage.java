package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement forgotLink;
	
	
	public LoginPage(){
	  PageFactory.initElements(driver, this);	
	}
	//Actions
	public void login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
	}
	
	public void forgotPwd() {
		forgotLink.click();
	}

}
