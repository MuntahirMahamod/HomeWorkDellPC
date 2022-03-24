package hw12XpathSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_click_method_by_linktext_PartialLinkText_locator_using_class {
	WebDriver driver;
	 
	@BeforeTest
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munta\\eclipse-workspace\\SeleniumMethods\\Driver\\chromedriver.exe"); // WebDriver is an interface and ChromeDriver is a concrete class driver =
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/"); 
		}
	  
	@Test (enabled=true, priority = 1)
	  	public void loginButtonTestByLink() throws InterruptedException {
		driver.findElement(By.linkText("How to sell")).click();
		Thread.sleep(4000);
	  	}
	@Test (enabled=true, priority =2)
  	public void loginButtonTestByPartialLinkText() throws InterruptedException {
	driver.findElement(By.linkText("How to s")).click();
	Thread.sleep(4000);
  	}
	@AfterTest 
	  	public void tearUp() {
		driver.quit();
	  	}
	
	
}
