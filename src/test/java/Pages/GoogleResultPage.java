package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {
	//declare global variables
	public RemoteWebDriver driver;
	
	//element locators
	@FindBy(how=How.XPATH, using="//*[text()='All']")
	public WebElement all;
	
	@FindBy(how=How.XPATH, using="//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")
	public WebElement searchbutton;
	
	//constructor method
	public GoogleResultPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
