package march2022seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		By right_click = By.xpath("//span[text()=\"right click me\"]");
		By click_Options = By
				.xpath("//ul[@class=\"context-menu-list context-menu-root\"]/li[contains(@class,'context-menu-icon')]");
		By click_Option_value=By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//span[text()='Edit']");
		
//		Actions act = new Actions(driver);
//		 act.moveToElement(driver.findElement(right_click)).contextClick().perform();
//		act.contextClick(driver.findElement(right_click)).perform();
//		Thread.sleep(1500);
//		List<WebElement> options=driver.findElements(click_Options);
//		System.out.println(options.size());
//		for(WebElement e:options) {
//			String text=e.getText();
//			if(text.contains("Paste")) {
//				e.click();
//				break;
//			}
//		}
		//selectRightClickMenuItems(right_click,click_Options,"Copy");
		//System.out.println(rightClickMenuItemsList(right_click,click_Options));
		directSelectRightClickMenuItems(right_click,click_Option_value);
	}
	
	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectRightClickMenuItems(By rightClickLocator,By click_Options,String value) throws InterruptedException {
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClickLocator)).perform();
		Thread.sleep(1500);
		List<WebElement> options=driver.findElements(click_Options);
		for(WebElement e:options) {
			String text=e.getText();
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}
	public static List<String> rightClickMenuItemsList(By rightClickLocator,By click_Options) throws InterruptedException {
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClickLocator)).perform();
		Thread.sleep(1500);
		List<WebElement> options=driver.findElements(click_Options);
		List<String> menuItems_List=new ArrayList<String>();
		for(WebElement e:options) {
			String text=e.getText();
			menuItems_List.add(text);
		}
		return menuItems_List;
	}
	
	public static void directSelectRightClickMenuItems(By rightClickLocator,By click_Option_value) throws InterruptedException {
		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClickLocator)).perform();
		Thread.sleep(1500);
		getElement(click_Option_value).click();

}
}
