package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class RegisterPage extends TestBase {

	@FindBy(id = "first_name")
	WebElement FirstName;

	@FindBy(id = "last_name")
	WebElement LastName;

	@FindBy(id = "email")
	WebElement Email;

	@FindBy(id = "mobile")
	WebElement Phone;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "confirm_password")
	WebElement ConfirmPassword;

	@FindBy(id = "recaptcha-anchor")
	WebElement ReCapture;

	@FindBy(id = "btn_register")
	WebElement RegisteredBtn;

	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}

	public void EnterFirstName() {
		FirstName.sendKeys("Yemi");

	}

	public void EnterLastName() {
		LastName.sendKeys("Oluko");
	}

	public void EnterEmail() {
		Email.sendKeys("yemi@bb.com");

	}

	public void EnterPhone() {
		Phone.sendKeys("07947890464");
	}

	public void EnterPassword() {
		Password.sendKeys("olukoya");
	}

	public void EnterConfirmPassword() {
		ConfirmPassword.sendKeys("olukoya");
	}

	public void EnterReCapture() {
		ReCapture.click();
	}

	public void ClickRegisteredBtn() {
		RegisteredBtn.click();
	}
}
