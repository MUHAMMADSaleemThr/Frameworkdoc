package Com.PeopleNTech.Framework.Com.PeopleNTech.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {
	public WebDriver driver;
@FindBy(xpath = "(//*[text()='Select & Continue'])[1]")
WebElement CreateAnAccountButton;
@FindBy(name = "email")
WebElement EmailFieldEnter;
@FindBy(name = "password")
WebElement Psswd;
@FindBy(name="zipcode")
WebElement ZipCodeFields;
@FindBy(name = "phone")
WebElement PhoneNumbersEnter;
@FindBy(xpath = "(//*[@class='checkbox-btn__label-test u__text-align--left'])[1]")
WebElement Signed;
@FindBy(xpath = "(//*[@class='checkbox-btn__label-test u__text-align--left'])[2]")
WebElement Mobiles;
@FindBy(xpath = "(//*[text()='Create an Account'])[2]")
WebElement Create;
public CreateAnAccount (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void CreateAnAccountButtonClick() {
	CreateAnAccountButton.click();
}
public void EmailFieldSendKeys(String email) {
	EmailFieldEnter.sendKeys(email);
	
}
public void PsswdSendKeys(String name) {
	Psswd.sendKeys(name);
}
public void ZipCodesEnters(String zipcodes) {
	ZipCodeFields.sendKeys(zipcodes);
}
public void Phone(String sg) {
	PhoneNumbersEnter.sendKeys(sg);
}
public void SignedOfClick() {
	Signed.click();
}
public void Mobiles() {
	Mobiles.click();
	
}
public void CreateButtonClick() {
	Create.click();
}

}
