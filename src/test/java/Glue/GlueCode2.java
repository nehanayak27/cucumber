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

public class GlueCode2 {
	
	//declare shared class object 
		public Sharedclass sh;
		
		//constructor method
		public GlueCode2(Sharedclass sh)
		{
			this.sh=sh;
			
		}
	
	
	
	@Then("^validate homepage title with \"(.*)\"$")
	public void titletest(String x)
	{
		
		String title=sh.driver.getTitle();
		if(title.contains(x))
		{
			sh.s.write(x+"title is passed");
		}
		else
		{
			sh.s.write(x+"title is failed");
		}
	}
	
}
