package Glue;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.GoogleHomePage;
import Pages.GoogleResultPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Sharedclass {
	
	public Scenario s;
	public Properties p;
	public RemoteWebDriver driver;
	public GoogleHomePage ghp; 
	public GoogleResultPage grp;
	
	
	
	@Before
	public void beforemethod(Scenario s) throws Exception
	{
		this.s=s;
		//load properties file path
		File f=new File("E:\\Batch251Selenium\\Selenium1\\seleniumPrac\\Cucumber\\src\\test\\resources\\properties\\config.properties");
		FileInputStream fi=new FileInputStream(f);
		 p=new Properties();
		 p.load(fi);	
	}

}
