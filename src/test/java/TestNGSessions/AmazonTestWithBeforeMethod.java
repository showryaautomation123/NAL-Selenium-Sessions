package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestWithBeforeMethod {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com/");
	}
	
	@Test
	public void pageTitleTest() {
		
		String title=driver.getTitle();
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
	}
	
	@Test
	public void pageurlTest() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("amazon"));
	}
	
	@Test
	public void searchExistTest(){
		boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
