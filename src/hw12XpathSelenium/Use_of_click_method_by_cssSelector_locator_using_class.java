package hw12XpathSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_click_method_by_cssSelector_locator_using_class {
	WebDriver driver;
	 
	@BeforeTest
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munta\\eclipse-workspace\\SeleniumMethods\\Driver\\chromedriver.exe"); // WebDriver is an interface and ChromeDriver is a concrete class driver =
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/"); 
		}
	  
	@Test (enabled=true, priority = 1)
	  	public void loginButtonTestByCssSelector() throws InterruptedException {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();
		Thread.sleep(4000);
	  	}
	 
	@AfterTest 
	  	public void tearUp() {
		driver.quit();
	  	}
	
	
}
