package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef extends TestBase {
	WebDriver driver;
	LoginPage loginPage;
	HomePage  homePage;

@Given("User is already on login page")
public void user_is_already_on_login_page() {
	
	initialize();
	loginPage = new LoginPage();
	
	/*WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://ui.cogmento.com/");
	*/
}

//data tables using Maps
@When("User enters login credentials")
public void user_enters_login_credentials(DataTable users) {
	List<Map<String, String>> data = users.asMaps();
//	driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
//driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	
	String strName = data.get(0).get("username");
	String strPwd = data.get(0).get("password");
	loginPage.login(strName, strPwd);
}


@Then("User is on home page")
public void user_is_on_home_page() {
	homePage = new HomePage();
	boolean userDisplay = homePage.isUserLoggedIn();
    Assert.assertTrue(userDisplay);
}

@Then("close the browser")
public void close_the_browser() {
	//driver.close();
}



}
