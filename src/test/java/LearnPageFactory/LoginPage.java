package LearnPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(how=How.ID,using="username") WebElement eleUsername;
	public LoginPage enterUsername()
	{
		eleUsername.sendKeys("demosalesmanager");
		return this;
	}
	
	@FindBy(how=How.ID,using="password") WebElement elePassword;
	public LoginPage enterPassword()
	{
		elePassword.sendKeys("crmsfa");
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") WebElement eleLogin;
	public LoginPage clickLogin()
	{
		eleLogin.click();
		return this;
	}
}
