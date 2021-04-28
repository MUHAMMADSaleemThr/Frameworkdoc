package Com.PeopleNTech.Framework.Com.PeopleNTech.Frame;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Ilistners extends Usability implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		 String Path=System.getProperty("user.dir");
		Date dt=new Date();
		String sw=dt.toString().replace(" ", "_").replace(":", "_");
		this.driver = ((Usability)result.getInstance()).driver;
		File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ds, new File(Path+"\\Pictures\\Passed\\"+sw+"Pictures.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 String Path=System.getProperty("user.dir");
		 Date dt=new Date();
			String sw=dt.toString().replace(" ", "_").replace(":", "_");
			this.driver = ((Usability)result.getInstance()).driver;
			File ds=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(ds, new File(Path+"\\Pictures\\Failed\\"+sw+"Shots.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	

}
