package COM.EXCEL;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import COM.POM.Login_Page_Actitime;

public class base_testcase {
	
public WebDriver driver;
	
	@Test
	public  void ActitimeApp() throws InterruptedException, IOException {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		Login_Page_Actitime lp=new Login_Page_Actitime(driver);
		lp.loginMethod();
		
	}
	
	
	

}



