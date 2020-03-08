package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordresetPOM {

		private WebDriver driver; 
		
		public PasswordresetPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}

		@FindBy(linkText="I lost my password")
		private WebElement Passwordreset; 

		@FindBy(id="lost_password_user")
		private WebElement email;

		@FindBy(id="lost_password_submit")
		private WebElement sendmessage;

		public void PasswordresetBtn() {
			this.Passwordreset.click(); 
		}
		public void enteremail(String email) {
			this.email.clear(); 
			this.email.sendKeys(email); 
		}

		public void sendmsg() {
			this.sendmessage.click(); 
		}
}
