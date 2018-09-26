package COM.POM;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import COM.EXCEL.Excel_Library;

public class Login_Page_Actitime extends Excel_Library{
	
	//declaration
	
		@FindBy(id="username")
		private WebElement UeserName_Textfield;
		
		@FindBy(xpath="//input[@name='pwd']")
		private WebElement pwd_Textfield;
		
		@FindBy(id="loginButtonContainer")
		private WebElement loggin_button;
		
		//Initialization
		
		public Login_Page_Actitime(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		
		public void loginMethod() throws InterruptedException, IOException {
			String Username=Excel_Library.getCellValue("D:\\Excel_data.xlsx", "Sheet1", 0, 1);
			String password=Excel_Library.getCellValue("D:\\Excel_data.xlsx", "Sheet1", 1, 1);
			
			UeserName_Textfield.sendKeys(Username);
			pwd_Textfield.sendKeys(password);
			loggin_button.click();
			
		}

}
