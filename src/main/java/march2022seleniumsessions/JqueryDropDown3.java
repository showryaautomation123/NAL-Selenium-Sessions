package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropDown3 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	BrowserUtil brutil = new BrowserUtil();
	driver = brutil.init_driver("chrome");
	driver.get("http://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	driver.findElement(By.id("justAnotherInputBox")).click();
//	List<WebElement> list = driver.findElements(By.xpath("(//div[contains(@id,'DropDownContainer')])[3]/ul//span[@class=\"comboTreeItemTitle\"]"));
//	System.out.println(list.size());
	
	By locator=By.xpath("(//div[contains(@id,'DropDownContainer')])[3]/ul//span[@class=\"comboTreeItemTitle\"]");
	
	
	selectChoice(locator,"choice 7");
}
	public static void selectChoice(By locator,String value) {
		List<WebElement>list = driver.findElements(locator);
		System.out.println(list.size());
		
			for(WebElement e:list) {
			String text=e.getText();
			System.out.println(text);
				if(text.contains(value)) {
					e.click();
			
				
			}
			
		}

		}
	
	
	
		
	}


