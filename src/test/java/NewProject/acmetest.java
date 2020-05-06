package NewProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class acmetest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElementByXPath("//button[text()=' Vendors']")).build().perform();
		System.out.println("clicked vendors");
		
		ac.moveToElement(driver.findElementByXPath("//a[text()='Search for Vendor']"));
		ac.click().build().perform();
		
		//driver.findElementByXPath("//a[text()='Search for Vendor']").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		WebElement table=driver.findElementByClassName("table");
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		List<WebElement> cols=driver.findElementsByXPath("//table[@class='table']//tr[1]/th");
		System.out.println("No. of rows in the table:" + rows.size());
		System.out.println("No. of cols in the table:" + cols.size());
		for(int i=2;i<=rows.size();i++)
		{
			WebElement rc=driver.findElementByXPath("//table[@class='table']//tr["+i+"]//td[1]");
			if(rc.getText().contains("Blue Lagoon"))
			{
			String country=driver.findElementByXPath("//table[@class='table']//tr["+i+"]//td[5]").getText();	
			System.out.println(country);
		}
		}
		//log out
		driver.findElementByXPath("//a[text()='Log Out']").click();
		driver.close();
	}

}
