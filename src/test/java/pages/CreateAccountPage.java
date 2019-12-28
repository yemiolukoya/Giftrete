package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class CreateAccountPage extends TestBase {

	@FindBy(xpath = "//a[contains(@href,'/account/authentication?ref=2')and contains(.,'Create account') ]")
	WebElement CreateAccount;

	public CreateAccountPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void ClickCreateAccount() {
		CreateAccount.click();
	}
}
