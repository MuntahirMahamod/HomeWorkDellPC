
 package hw12XpathSelenium;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class B_use_of_get_method {
	WebDriver driver;
 
@BeforeTest
public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\munta\\eclipse-workspace\\SeleniumMethods\\Driver\\chromedriver.exe"); // WebDriver is an interface and ChromeDriver is a concrete class driver =
	driver=new ChromeDriver();
	driver.get("https://portaldev.cms.gov/portal/"); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(4000); }
  
@Test (enabled=true, priority = 1)
  	public void loginButtonTestById() throws InterruptedException {
	driver.findElement(By.id("cms-login-submit")).click();
	Thread.sleep(4000);
  	}
@Test (enabled=true, priority = 1)
	public void loginButtonTestByName() throws InterruptedException {
	driver.findElement(By.name("Submit Login")).click();
	Thread.sleep(4000);
}
@Test (enabled=true, priority = 1)
public void loginButtonTestByClass() throws InterruptedException {
driver.findElement(By.className("cms-green-button-reg")).click();
Thread.sleep(4000);
}
  
@AfterTest 
  	public void tearUp() {
	driver.quit();
  	}
 
}
