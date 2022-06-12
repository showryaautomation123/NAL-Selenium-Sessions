package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		By source=By.id("draggable");
		By target=By.id("droppable");
		Actions act=new Actions(driver);
//		act.clickAndHold(getElement(source)).moveToElement(getElement(target)).release().build().perform();
//		act.clickAndHold(getElement(source)).moveToElement(getElement(target)).release().build();
		act.clickAndHold(getElement(source)).moveToElement(getElement(target)).release().perform();
		
//		act.dragAndDrop(getElement(source), getElement(target)).perform();
//		act.dragAndDrop(getElement(source), getElement(target)).build().perform();
//		act.dragAndDrop(getElement(source), getElement(target)).build();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void actionsDragDrop(By sourcelocator,By targetlocator) {
		Actions act=new Actions(driver);
		act.clickAndHold(getElement(sourcelocator)).moveToElement(getElement(targetlocator)).release().build().perform();
		
	}

}
