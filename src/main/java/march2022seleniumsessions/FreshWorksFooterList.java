package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreshWorksFooterList {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		
		driver.get("https://www.freshworks.com/");
		Thread.sleep(3000);
		List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@class='footer-main']//ul//a"));
//		System.out.println(footerlinks.size());
//		for(WebElement e:footerlinks) {
//			String text=e.getText();
//			System.out.println(text);
//		}
		//footerlinks.stream().forEach(e->System.out.println(e.getText()));
		footerlinks.stream().filter(e->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));
		

	}

}
