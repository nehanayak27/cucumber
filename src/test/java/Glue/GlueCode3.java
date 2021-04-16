package Glue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.GoogleHomePage;
import Pages.GoogleResultPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GlueCode3 {
	
	//declare shared class object 
	public Sharedclass sh;
	
	//constructor method
	public GlueCode3(Sharedclass sh)
	{
		this.sh=sh;
		
	}
	@Given("^launch site with the url as \"(.*)\" in \"(.*)\" browser$")
	 public void  launchSite(String url,String browser)
	 {
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			  sh.driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			  sh.driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			  sh.driver=new OperaDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			  sh.driver=new EdgeDriver();
		}
		else
		{
			System.out.println("wrong browser");
			System.exit(0); 
		}
		sh.driver.manage().window().maximize();
		sh.driver.get(url);
		sh.ghp=new GoogleHomePage(sh.driver);
		sh.grp=new GoogleResultPage(sh.driver);
		
	 }

		
		
		@Then("^validate site security$")
		public void validatesitesecurity()
		{
			
			String url=sh.driver.getCurrentUrl();
			if(url.contains("https"))
			{
				sh.s.write(url+"url is a secured site");
			}
			else
			{
				sh.s.write(url+"url is not a secured site");
			}
		}
		
		


}
