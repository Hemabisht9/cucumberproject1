package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
        WebDriver driver;
        public LoginPage(WebDriver driver) {
        	this.driver = driver;
        }
        
        @FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement Username;
        @FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement Password;
        @FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement SigninButton;

       public void enterUserName(String username) {
    	   Username.sendKeys(username);
    	   try {
    		   Thread.sleep(2000);
    	   }catch(InterruptedException e) {
    		   e.printStackTrace();
    	   }
       }

      public void enterPassword(String password) {
    	  Password.sendKeys(password);
    	  try {
    		  Thread.sleep(2000);
    	  }catch(InterruptedException e) {
    		  e.printStackTrace();
    	  }
      }

      public void clickSignInButton() {
    	  SigninButton.click();
    	  try {
    		  Thread.sleep(2000);
    	  }catch(InterruptedException e) {
    		  e.printStackTrace();
    	  }
      }
      public String getThePageTitle() {
    	 return  driver.getTitle();
      
      }     
}
