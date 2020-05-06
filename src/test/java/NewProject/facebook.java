package NewProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("mithraa.raja.13@gmail.com");
		driver.findElementById("pass").sendKeys("smileplz");
		driver.findElementByXPath("//label[@id='loginbutton']/input").click();
		driver.findElementByXPath("//input[@name='q']").sendKeys("TestLeaf solutions",Keys.ENTER);
		
		
		driver.findElementByXPath("//a[text()='TestLeaf']").click();
		String likebutton=driver.findElementByXPath("//button[@class='likeButton _4jy0 _4jy4 _517h _51sy _42ft']").getText();
		System.out.println(likebutton);
		if(likebutton.equalsIgnoreCase("Like"))
		{
			driver.findElementByXPath("//button[@class='likeButton _4jy0 _4jy4 _517h _51sy _42ft']").click();
		}
		driver.findElementById("userNavigationLabel").click();
		Actions action=new Actions(driver);
		action.pause(2000);
		driver.findElementByXPath("//span[text()='Log Out']").click();
		
		
		
		
		
		

	}

}
