package stepdefs;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;
import pages.HomePage;

public class ContactStepDef extends TestBase {
	
HomePage homePage;
ContactPage contactPage;

@Given("User is on Contact page")
public void user_is_on_Contact_page() {
   homePage = new HomePage();
   contactPage = homePage.navigate_contactPage();
}

@When("Enter contact details")
public void enter_contact_details() {
	contactPage = new ContactPage();
	contactPage.createContact("Training", "TestUserTwo");
}

@Then("New contact is created")
public void new_contact_is_created() {
    
}



}
