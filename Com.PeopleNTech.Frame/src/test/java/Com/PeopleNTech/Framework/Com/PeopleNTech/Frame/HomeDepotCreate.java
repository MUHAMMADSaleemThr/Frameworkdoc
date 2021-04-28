package Com.PeopleNTech.Framework.Com.PeopleNTech.Frame;

import org.testng.annotations.Test;

public class HomeDepotCreate extends Usability {
  @Test
  public void f() throws InterruptedException {
	  Home home=new Home(driver);
	  CreateAnAccount create=new CreateAnAccount(driver);
	  home.MyAccountClicking();
	  Thread.sleep(6000);
	  home.RegistrationButtonClick();
	  create.CreateAnAccountButtonClick();
	  create.EmailFieldSendKeys("Shahvbaz@gmail.com");
	  create.PsswdSendKeys("townhouse");
	  create.Phone("703456789");
	  create.ZipCodesEnters("20175");
	  create.SignedOfClick();
	  create.Mobiles();
	  create.CreateButtonClick();
  }
}
