package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ParentChildMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
//	driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//	driver.findElement(By.xpath("//a[@class='menu']")).click();
//	Thread.sleep(1500);
//	driver.findElement(By.xpath("//a[contains(text(),'Services')]")).click();
//	Thread.sleep(1500);
//	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
//	Actions act=new Actions(driver);
//	act.moveToElement(driver.findElement(By.className("menulink"))).perform();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(),'Courses')]")).click();
//	driver.findElement(By.linkText("COURSES")).click();
//	
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By parentMenu_content = By.className("menulink");
		By childMenu_courses = By.linkText("COURSES");
		// By components=By.xpath("//a[contains(text(),'Components')]");
		By all_components = By.linkText("Show All Components");
		By components = By.linkText("Components");
        By cameras=By.linkText("MP3 Players");
        By test=By.linkText("test 21 (0)");
		// levelTwoMenuHandling(parentMenu_content,childMenu_courses);
		//levelTwoMenuHandling(components, all_components);
        levelTwoMenuHandling(cameras,test);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void levelTwoMenuHandling(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
	}
}
