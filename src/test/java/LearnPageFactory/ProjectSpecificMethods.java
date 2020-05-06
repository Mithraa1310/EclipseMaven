package LearnPageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class ProjectSpecificMethods {
	

		public static ChromeDriver driver;
		
		@BeforeMethod
			public void startApp()  {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
			}	
			
			@AfterMethod
			public void closeApp() {

				driver.close();
		}

}
