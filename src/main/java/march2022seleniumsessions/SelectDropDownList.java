package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			BrowserUtil brutil = new BrowserUtil();
			driver = brutil.init_driver("chrome");
			
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			By locator_country=By.id("Form_submitForm_Country");
			
//			Select select=new Select(getElement(locator));
//			select.selectByIndex(15);
//			select.selectByValue("India");
//			select.selectByVisibleText("Egypt");
			selectDropDownByIndex(locator_country,10);
			selectDropDownByValue(locator_country,"Uganda");
			selectDropDownByVisibleText(locator_country,"United Kingdom");
			
	}

		public  static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static void selectDropDownByIndex(By locator,int number) {
			Select select=new Select(getElement(locator));
			select.selectByIndex(number);
			
		}
		public static void selectDropDownByValue(By locator,String value) {
			Select select=new Select(getElement(locator));
			select.selectByValue(value);
			
		}
		
		public static void selectDropDownByVisibleText(By locator,String textvalue) {
			Select select=new Select(getElement(locator));
			select.selectByVisibleText(textvalue);
			
		}
}
