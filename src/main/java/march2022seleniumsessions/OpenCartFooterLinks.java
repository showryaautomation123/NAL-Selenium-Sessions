package march2022seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenCartFooterLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(3000);
		List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@class=\"col-sm-3\"]//li/a"));
		System.out.println(footerlinks.size());
		for(WebElement e:footerlinks) {
			//List<String> footertextlist=new ArrayList();
			String footertext=e.getText();
			System.out.println(footertext);
			if(footertext.contains("Brands")) {
				e.click();
				break;
			}
		
			
		}

	}

}
