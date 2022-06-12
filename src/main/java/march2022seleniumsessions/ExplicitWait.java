package march2022seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

		static WebDriver driver;
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			 By name=By.xpath("//input[@name='firstname']");
//			 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//			 wait.until(ExpectedConditions.presenceOfElementLocated(name)).sendKeys("sara");
			 By lastname=By.xpath("//input[@name='lastname']");
//			By email=By.xpath("//input[@name='reg_email__']");
//			By password=By.xpath("//input[@name='reg_passwd__']");
//			getElement(lastname).sendKeys("sen");
//			getElement(email).sendKeys("sana@gmail.com");
//			By reenterEmail=By.xpath("//input[@name='reg_email_confirmation__']");
//			getElement(reenterEmail).sendKeys("sana@gmail.com");
//			//wait.until(ExpectedConditions.visibilityOfElementLocated(reenterEmail)).sendKeys("sana@gmail.com");
//			getElement(password).sendKeys("sana123");
			 waitForElementPresence(name,5).sendKeys("eon");
			 waitForElementVisible(lastname,5).sendKeys("shepard");
			
	}
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static WebElement waitForElementPresence(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		public static WebElement waitForElementVisible(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
}
