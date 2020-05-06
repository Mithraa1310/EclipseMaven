package NewProject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectDay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@class='search']").click();
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		Date date = new Date();
		DateFormat date1= new SimpleDateFormat("dd");
		String today=date1.format(date);
		int tomorrow=Integer.parseInt(today)+1;
		System.out.println("tomorrow's date");
		System.out.println(tomorrow);
		//driver.findElementByXPath("//div[text()='Sat']").click();
		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		driver.findElementByXPath("//button[text()='Done']").click();
		List<WebElement> pricelist = driver.findElementsByXPath("//div[@class='price']");
		
		List<Integer> list1=new ArrayList<Integer>();
		System.out.println("List of Prices");
		for(WebElement prices:pricelist)
		{
			String f1=prices.getText();
			
			System.out.println(f1);
			
			 String f2=f1.replaceAll("[^0-9]", "");
			
			 System.out.println(f2);
			 int items=Integer.parseInt(f2);
			 list1.add(items);
			 
			
			
		}
		
		System.out.println(list1.size());
		int finalvalue=Collections.max(list1);
		System.out.println("maximum value:");
		System.out.println(finalvalue);
		
	}

}
