package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.NewAccountPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
	LoginPage loginpage;
	 NewAccountPage newaccountpage;
	
	 @Before
	 public void setUp() {
		 initDriver();
		 loginpage = PageFactory.initElements(driver, LoginPage.class);
		 newaccountpage = PageFactory.initElements(driver, NewAccountPage.class);
	 }
	
	
	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}
	
	

	@When("User enters username as {string}")
	public void user_enters_the_in_the_fieldUserName(String username) {
		loginpage.enterUserName(username);
	
	}
	@When ("User enters  password as {string}")
	public void user_enters_password_in_Passwordfield(String password) {
		loginpage.enterPassword(password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_sign_in_button() {
	 loginpage.clickSignInButton();
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		 String expectedTitle = "Dashboard- iBilling";
		   String actualTitle = loginpage.getThePageTitle();
		   Assert.assertEquals(expectedTitle, actualTitle);
		   try {
	 		  Thread.sleep(2000);
	 	  }catch(InterruptedException e) {
	 		  e.printStackTrace();
	 	  }
	}
	@Then("User clicks on bankandCash button")
	public void user_clicks_on_bankandCash_button() {
		 newaccountpage.clickBankCashButton();
	}
	@Then("User clicks on newAccount button")
	public void user_clicks_on_newAccount_button() {
		newaccountpage.clickNewAccountButton();
	}


	@Then("User enters accountTitleas as {string}")
	public void user_enters_accountTitleas_as(String accounttitle) {
		  newaccountpage.enterTheAcccountTitle(accounttitle);
	}

	@Then("User enters description as {string}")
	public void user_enters_description_as(String description) {
		newaccountpage.enterDescription(description);
	}


	@Then("User enters initialBalance as {string}")
	public void user_enters_initialBalance_as_$(String initialBalance) {
		newaccountpage.enterInitialBalance(initialBalance);
	}

	@Then("User enters accountNumber as {string}")
	public void user_enters_accountNumber_as(String accountNumber) {
		newaccountpage.enterAccountNumber(accountNumber);
	}

	@Then("User enters contactPerson as {string}")
	public void user_enters_contactPerson_as(String contactPerson) {
		newaccountpage.enterContactPersonInfo(contactPerson);

	}

	@Then("User enters Phone as {string}")
	public void user_enters_Phone_as(String Phone) {
		 newaccountpage.enterPhoneInfo(Phone);
	}

	@Then("User enters internetBankingURL as {string}")
	public void user_enters_internetBankingURL_as_https_www_techfios_com(String internetBankingURL) {
		 newaccountpage.enterInternetBankingUrl(internetBankingURL);
	}
	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		newaccountpage.clickOnSubmitButton();
	}
	

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		takeScreenShot(driver);
	}
	@After
	public void tearDown() {
    	driver.close();
    	driver.quit();
    	
    }
}
	
	