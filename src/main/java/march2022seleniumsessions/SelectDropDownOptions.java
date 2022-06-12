package march2022seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By locator_country=By.id("Form_submitForm_Country");
//		Select select = new Select(getElement(locator_country));
//		List<WebElement> optionslist=select.getOptions();
//		for(WebElement e:optionslist) {
//			//List<String> textlist=new ArrayList<String>();
//			String text=e.getText();
//			System.out.println(text);
//			//textlist.add(text);
//			if(text.contains("Japan")) {
//				e.click();
//			}
//		}
		selectDropDownOptions(locator_country,"Germany");
	}

	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectDropDownOptions(By locator,String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionslist=select.getOptions();
		for(WebElement e:optionslist) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
			}
		}
	}
}
