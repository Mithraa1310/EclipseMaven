package LearnPageFactory;

import org.testng.annotations.Test;

public class TC001_PageFact extends ProjectSpecificMethods{

	@Test
	public void runLogin()
	{
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin();
	}
	
}
