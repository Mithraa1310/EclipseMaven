import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailcreation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.findElementById("firstName").sendKeys("Mithraa");
		driver.findElementById("lastName").sendKeys("Rajakanthan");
		driver.findElementById("username").sendKeys("iamseeingtrial");
		driver.findElementByName("Passwd").sendKeys("pleaseaccept@3");
		driver.findElementByName("ConfirmPasswd").sendKeys("pleaseaccept@3");
		driver.findElementByXPath("//span[@class='RveJvd snByac']").click();
		
				
		driver.findElementById("phoneNumberId").sendKeys("9500616525");
		driver.findElementByXPath("//span[text()='Next']").click();
		Thread.sleep(15000);
		//Enter OTP
		driver.findElementByXPath("//span[text()='Verify']").click();
		
		WebElement ele = driver.findElementByXPath("(//input[@class='whsOnd zHQkBf'])[2]");
		
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.(ele));
		
		driver.findElementByXPath("(//input[@class='whsOnd zHQkBf'])[2]").sendKeys("mithraa.raja.13@gmail.com");
		driver.findElementByXPath("(//input[@class='whsOnd zHQkBf'])[3]").sendKeys("10");
		
		WebElement month=driver.findElementById("month");
		Select dropDown4=new Select(month);
		
		dropDown4.selectByVisibleText("October");
		driver.findElementByXPath("(//input[@class='whsOnd zHQkBf'])[4]").sendKeys("1990");
		
		WebElement gender=driver.findElementById("gender");
		Select dropDown=new Select(gender);
		
		dropDown.selectByVisibleText("Female");
		
		driver.findElementByXPath("//span[text()='Next']").click();
		

	}

}
