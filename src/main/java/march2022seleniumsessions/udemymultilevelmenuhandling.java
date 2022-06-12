package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class udemymultilevelmenuhandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		driver.get("https://www.udemy.com/");
		By categories = By.xpath("//span[contains(text(),'Categories')]");
		By it_Software=By.xpath("//a[@id=\"header-browse-nav-category-294\"]/div[contains(text(),'IT & Software')]");
		By it_certifications=By.xpath("//ul[@class=\"unstyled-list udlite-block-list list-menu--section--BZ3j9\"]//div[contains(text(),'IT Certifications')]");
		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(categories)).perform();
//		Thread.sleep(1500);
//		act.moveToElement(driver.findElement(it_Software)).perform();
//		Thread.sleep(1500);
//		act.moveToElement(driver.findElement(it_Software)).perform();
		multiLevelMenuHandling(categories,it_Software,it_certifications);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void multiLevelMenuHandling(By parentMenu, By locator1, By locator2) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);

		act.moveToElement(getElement(locator1)).perform();;
		Thread.sleep(1500);
		
		getElement(locator2).click();
		Thread.sleep(1500);

	}


}
