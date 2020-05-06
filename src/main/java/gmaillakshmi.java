/*
public class gmaillakshmi {

	import java.util.concurrent.TimeUnit;
	//import java.util.function.Function;
	import java.util.stream.Stream;
	import java.util.stream.StreamSupport;

	import org.openqa.selenium.By;
	//import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.support.ui.ExpectedConditions;
	//import org.openqa.selenium.support.ui.Select;
	//import org.openqa.selenium.support.ui.WebDriverWait;

	import com.twilio.Twilio;
	import com.twilio.base.ResourceSet;
	import com.twilio.rest.api.v2010.account.Message;

	public class Gmail {
		public static final String account_sid="AC49af4a13fa3f5151ae818a4e181eab65";
		public static final String auth_token= "3ea63af42b1b76bf5a62cdbf5998def2";
		
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://accounts.google.com/signup/v2");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Laxmi");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("priya");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("laxmipriyas123495678@gmail.com");

			driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("gmail@123");
			driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("gmail@123");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//span[text()='United States ']")).click();
			driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("2029523673");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			Twilio.init(account_sid,auth_token);
			String smsbody= getMessage();
			System.out.println(smsbody);
			String otpnumber=smsbody.replaceAll("[^-?0-9]+", "");
			System.out.println(otpnumber);
			
		}
		
	public static String getMessage() {
		return getMessages().filter(m->m.getDirection().compareTo(Message.Direction.INBOUND)==0).filter(m->m.getTo().equals("+12029523673")).map(Message::getBody).
				findFirst().orElseThrow(IllegalStateException::new);
	}
	private static Stream<Message> getMessages(){
	ResourceSet<Message> messages=Message.reader(account_sid).read();
	return StreamSupport.stream(messages.spliterator(),false);	
	}
	}

}*/
