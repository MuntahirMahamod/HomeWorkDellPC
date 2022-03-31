package hw13SelinumMathod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

public class TestSeleniumMathod {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\munta\\eclipse-workspace\\SeleniumMethods\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}

	@Test(enabled = true, priority = 1)
	public void testSomeElement() throws InterruptedException {
		boolean elementDisplayed = driver.findElement(By.xpath("//em[@id='cms-homepage-login-logo']")).isDisplayed();
		System.out.println("Is the login logo displayed? Ans: " + elementDisplayed);
		boolean elementEnabled = driver.findElement(By.xpath("//button[@id='cms-login-submit']")).isEnabled();
		System.out.println("Is the login button enabled? Ans: " + elementEnabled);
		boolean checkboxEnabled = driver.findElement(By.cssSelector("label.cms-label-tc.cms-checkbox-label"))
				.isSelected();
		System.out.println("Is the check box selected? Ans: " + checkboxEnabled);
		System.out.println("The Titel of the page is: " + driver.getTitle());
		// Q to Tofael Bro? I am using partial text instead of inner text. I got results
		// and I fill more comfortable. Can I use its? is it correct way?
		WebElement testGetText = driver
				.findElement(By.xpath("//span[contains(text(), ' federal government website managed') ]"));
		System.out.println("The text for the webElement is: " + testGetText.getText());
		String findAttribute = driver.findElement(By.xpath("//a[@id='cms-forgot-password']")).getAttribute("id");
		System.out.println("The value of the id attribute is: " + findAttribute);
	}

	@Test(enabled = true, priority = 2)
	public void sendKeys() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("Robart");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("RobartLee");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='cms-login-password']")).sendKeys("Ro@#1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='cms-label-tc cms-checkbox-label' and @id='cms-label-tc']"))
				.click();
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 3)
	public void linkTest() throws InterruptedException {
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("He")).click();
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}