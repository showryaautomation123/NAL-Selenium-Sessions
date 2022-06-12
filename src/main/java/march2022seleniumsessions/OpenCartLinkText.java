package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenCartLinkText {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			BrowserUtil brutil = new BrowserUtil();
			driver = brutil.init_driver("chrome");
			
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			Thread.sleep(3000);
			List<WebElement> linksList = driver.findElements(By.xpath("//div[@class=\"list-group\"]/a"));
			System.out.println(linksList.size());
			for(WebElement e:linksList) {
				String text=e.getText();
				System.out.println(text);
				if(text.contains("Register")) {
					e.click();
					break;
				}
			}

	}

}
