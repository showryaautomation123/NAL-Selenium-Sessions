package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email=By.id("input-email");
		By password=By.id("input-password");
		By loginbtn=By.xpath("//input[@type=\"submit\"]");
//		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(email), "automation@gmail.com").perform();
//		act.sendKeys(driver.findElement(password),"automation13").perform();
//		act.click(driver.findElement(loginbtn)).perform();
		
		actionSendKeys(email,"testing@gmail.com");
		actionSendKeys(password, "tester123");
		actionClick(loginbtn);

	}
	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void actionSendKeys(By locator,String value){
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	public static void actionClick(By locator){
		Actions act=new Actions(driver);
		act.click(getElement(locator)).perform();
	}
		

		
	}

