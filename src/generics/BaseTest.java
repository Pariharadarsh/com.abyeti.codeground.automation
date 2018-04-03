package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant
{
	public static WebDriver driver;
	static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@BeforeMethod
	public void openApplication(){
		
		driver=new FirefoxDriver();
		String url = Lib.getPropertyValue("URL");
		//driver.manage().window().maximize();
		driver.get(url);
		String ITO = Lib.getPropertyValue("ImplicitWait");
		long timeOuts = Long.parseLong(ITO);
		driver.manage().timeouts().implicitlyWait(timeOuts, TimeUnit.SECONDS);

	}

	@AfterMethod(alwaysRun=true)
	public void closeApplication(ITestResult result) throws Exception{
		if (ITestResult.FAILURE==result.getStatus()) {
			Lib.getScreenshot(driver, result.getName());
		}  
		Thread.sleep(5000);
		driver.close();
	}

}
