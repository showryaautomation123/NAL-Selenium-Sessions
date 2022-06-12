package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email=By.id("input-email");
//	 driver.findElements(email);
//		if(driver.findElements(email).size()>0) {
//			System.out.println("Element is displayed");
//		}

		System.out.println(elementIsDisplayed(email));
	}

	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public  static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static boolean elementIsDisplayed(By locator) {
		if( getElements(locator).size()>0) {
			if(getElement(locator).isDisplayed()) {
				return true;
			}
		}
		return false;
	}
}
