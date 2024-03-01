package testing.login;

import org.openqa.selenium.*; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class log {

	
	 WebDriver  d;
	
	
	@BeforeTest
	public void setup() {
	

    System.setProperty("webdriver.chrome.driver", "/Users/vishal.rane/Desktop/driver/chromedriver");
	
     d = new ChromeDriver();
	   
	   
	
	}
		
	@Test	
	public void logintest() throws InterruptedException {
		
		
		d.get("https://star.samco.in/");
		
	    Thread.sleep(5000);
		
		System.out.println("hello World");
		
		
	}
	
	
	@AfterTest
	public void teardown() {
		
		
		d.close();
		
		
	}
	
}
