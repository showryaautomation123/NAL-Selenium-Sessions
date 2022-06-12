package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownWithoutSelect {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By locator_country=By.xpath("//select[@id='Form_submitForm_Country']/option");
//		List<WebElement> countrylist = driver.findElements(locator_country);
//		
//		for(WebElement e:countrylist) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.contains("Switzerland")) {
//				e.click();
//			}
//		}
		DropDownWithoutSelectClass(locator_country,"Switzerland");
		
		
	}
	
	public static void DropDownWithoutSelectClass(By locator,String value) {
List<WebElement> countrylist = driver.findElements(locator);
		
		for(WebElement e:countrylist) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
