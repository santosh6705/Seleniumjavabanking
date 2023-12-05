package com.internetbanking.testcase;

import org.apache.log4j.Logger;

//import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.internetbanking.utilities.ReadConfig;

//import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass  {
	ReadConfig rd=new ReadConfig();
	
	
	
	public String baseurl=rd.getApplicationURL();
	public String username=rd.getUsername();
	public String password=rd.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	//@Parameters("Browser")
	@BeforeClass
	 public void setup()
	 {
		 
		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santo\\\\Desktop\\Internebanking\\Guru_E_Banking\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		/*if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",rd.getChromepath());
		 driver=new ChromeDriver();
		// driver.manage().window().maximize();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",rd.getgedckopath());
			 driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver",rd.idepath());
			 driver=new InternetExplorerDriver();
		}
		 */
		 logger =Logger.getLogger("Guru_E_Banking");
	    PropertyConfigurator.configure("Log4j.properties");
	 }
	/*@AfterClass
	public void tearDown()
	{
		
			driver.quit();
	}*/
	

}
