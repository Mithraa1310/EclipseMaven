import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class facebooknotification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//login
		driver.findElementById("email").sendKeys("mithraa.raja.13@gmail.com");
		driver.findElementById("pass").sendKeys("smileplz");
		driver.findElementByXPath("//label[@id='loginbutton']/input").click();
		//driver.findElementByXPath("//div[@class='_2n_9 f_click']").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("(//span[@class='fwb _6btd'])[1]").click();
		
		//arrow
		driver.findElementById("userNavigationLabel").click();
		
		//settings
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElementByXPath("(//span[@class='_54nh'])[5]"));
		driver.findElementByXPath("(//span[@class='_54nh'])[5]").click();
		
		//language and region
		
		driver.navigate().refresh();
		
		driver.findElementByXPath("(//div[@class='linkWrap noCount'])[9]").click();
		
		driver.findElementByXPath("(//span[text()='Edit'])[1]").click();
	
		WebElement language = driver.findElementByName("new_language");
		Select dropdown1=new Select(language);
		dropdown1.selectByVisibleText("English (UK)");
		driver.findElementByXPath("//input[@type='submit']").click();
		
		//checkbox
		/*driver.findElementByXPath("(//span[@class='fbSettingsListItemEditText'])[7]").click();
		driver.findElementByXPath("//label[text()='Write posts in more than one language']").click();
		
		//friend request
		driver.findElementByXPath("(//div[@class='_2n_9 f_click']").click();
		//WebElement frndname = driver.findElementByXPath("//a[@title='Vikash Deva']");
		//if(frndname.toString().equalsIgnoreCase("Vikash Deva"))
		//{
			//button[@name='actions[accept]'])//confirm button have to be located
		//}
		*/

	}

}
