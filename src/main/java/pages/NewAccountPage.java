package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends TestBase {
    WebDriver driver;
    public NewAccountPage (WebDriver driver) {
    	this.driver = driver;
    }                                
   @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]") WebElement BankAndCashButton;
   @FindBy(how = How.XPATH, using = "//a[text()='New Account']") WebElement NewAccountButton;
   @FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement Accounttitle;
   @FindBy(how = How.XPATH, using = "//input[@id='description']") WebElement Descriptioninfo;
   @FindBy(how = How.XPATH, using = "//input[@id='balance']")WebElement Initialbalanceinfo;
   @FindBy(how = How.XPATH, using = "//input[@id='account_number']")WebElement Accountnumberinfo;
   @FindBy(how = How.XPATH, using = "//input[@id='contact_person']")WebElement Contactpersoninfo;
   @FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")WebElement Phoneinfo;
   @FindBy(how = How.XPATH, using = "//input[@id='ib_url']")WebElement Interentbankingurlinfo;
   @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")WebElement Submitbutton;
   
   public void clickBankCashButton() {
	   BankAndCashButton.click();
	   try {
			  Thread.sleep(2000);
		  }catch(InterruptedException e) {
			  e.printStackTrace();
		  }
   }
  
  public void clickNewAccountButton() {
	  NewAccountButton.click();
	  try {
		  Thread.sleep(2000);
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
  }
  
   public void enterTheAcccountTitle(String accounttitle) {
	   Accounttitle.sendKeys("john" + randomNumGenerator(99));
	   try {
			  Thread.sleep(2000);
		  }catch(InterruptedException e) {
			  e.printStackTrace();
		  }
   }
   public void enterDescription(String description) {
	   Descriptioninfo.sendKeys(description);
	   try {
			  Thread.sleep(2000);
		  }catch(InterruptedException e) {
			  e.printStackTrace();
		  }
   }
     public void enterInitialBalance(String initialBalance) {
     Initialbalanceinfo.sendKeys(initialBalance);
     try {
		  Thread.sleep(2000);
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
     }
     public void enterAccountNumber(String accountNumber) {
    	 Accountnumberinfo.sendKeys(accountNumber + randomNumGenerator(99));
    	 try {
   		  Thread.sleep(2000);
   	  }catch(InterruptedException e) {
   		  e.printStackTrace();
   	  }
     }
     public void enterContactPersonInfo(String contactPerson) {
    	 Contactpersoninfo.sendKeys(contactPerson);
    	 try {
      		  Thread.sleep(2000);
      	  }catch(InterruptedException e) {
      		  e.printStackTrace();
      	  }
     }
     public void enterPhoneInfo(String Phone) {
    	 Phoneinfo.sendKeys("2345678" + randomNumGenerator(999));
    	 try {
     		  Thread.sleep(2000);
     	  }catch(InterruptedException e) {
     		  e.printStackTrace();
     	  }
     }
     public void enterInternetBankingUrl(String internetBankingURL) {
    	 Interentbankingurlinfo.sendKeys(internetBankingURL);
    	 try {
    		  Thread.sleep(2000);
    	  }catch(InterruptedException e) {
    		  e.printStackTrace();
    	  }
     }
      public void clickOnSubmitButton() {
    	  Submitbutton.click();
    	  try {
    		  Thread.sleep(2000);
    	  }catch(InterruptedException e) {
    		  e.printStackTrace();
    	  }
      }
}


