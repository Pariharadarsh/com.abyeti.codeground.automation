package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Declare elements
		@FindBy(id="username")
		WebElement unTB;

		@FindBy(name="pwd")
		WebElement pwdTB;

		@FindBy(xpath="//div[text()='Login ']")
		WebElement loginButton;
		//intilization	
		public LoginPage(WebDriver driver){
			//PageFactory is a class and initElements is a static method
			PageFactory.initElements(driver, this);
		}
		//utilization of user
		public void setUserName(String un){
			unTB.sendKeys(un);
		}
		public void setPassword(String pw){
			pwdTB.sendKeys(pw);
		}
		public void clickLogin(){
			loginButton.click();
		}

}
