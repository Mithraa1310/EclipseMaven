package NewProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElementByXPath("(//span[contains(text(),'Account & Lists')])[1]")).perform();
		//Thread.sleep(3000);
		
		/*WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//a[text()='Start here.']")));*/
		
		
		driver.findElementByXPath("//a[text()='Start here.']").click();
		driver.findElementById("ap_customer_name").sendKeys("Mithraa");
		driver.findElementByXPath("//input[@id='ap_phone_number']").sendKeys("9500616525");
		driver.findElementById("ap_email").sendKeys("mithraa.raja.13@gmail.com");
		driver.findElementById("ap_password").sendKeys("Aarushi2020");
		driver.findElementByXPath("//input[@id='continue']").click();
		driver.findElementByXPath("(//a[@class='a-link-normal'])[3]").click();
		driver.findElementById("ap_email").sendKeys("9500616525");
		driver.findElementById("continue").click();
		Thread.sleep(10000);
		//driver.findElementByXPath("//input[@class='a-input-text a-span12 cvf-widget-input cvf-widget-input-code']").sendKeys("212867");
		driver.findElementByXPath("(//span[@class='a-button-text'])[1]").click();
		driver.findElementById("ap_fpp_password").sendKeys("Mithraa123%");
		driver.findElementById("ap_fpp_password_check").sendKeys("Mithraa123%");
		driver.findElementByXPath("(//span[@class='a-button-text'])[2]").click();
		
	}

}
