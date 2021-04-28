package Com.PeopleNTech.Framework.Com.PeopleNTech.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
@FindBy(xpath = "//*[text()='My Account']") 
WebElement MyAccountClick;
@FindBy(xpath = "//*[text()='Register']")
WebElement Registration;
public Home (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void MyAccountClicking() {
	MyAccountClick.click();
}
public void RegistrationButtonClick() {
	Registration.click();
}
}
