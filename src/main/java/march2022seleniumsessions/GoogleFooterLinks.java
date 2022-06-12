package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleFooterLinks {
static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		
		driver.get("https://www.google.com/");
		List<WebElement> footerlist = driver.findElements(By.xpath("//div[@class=\"KxwPGc SSwjIe\"]/div/a"));
		System.out.println(footerlist.size());
		for (WebElement e : footerlist) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("Terms")) {
				e.click();
			}
		}
	}

}
