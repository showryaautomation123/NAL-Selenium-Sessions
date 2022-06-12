package march2022seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		
		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("java selenium");
//		Thread.sleep(3000);
//		List<WebElement> sugglist=driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//div[@class=\"wM6W7d\"]/span"));
//		for(WebElement e:sugglist) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.contains("java selenium jobs")) {
//				e.click();
//				break;
//			}
//					
//		}
		By suggestions=By.xpath("//ul[@class=\"G43f7e\"]//div[@class=\"wM6W7d\"]/span");
		//googleSuggestionList(suggestions,"java selenium");
		//selectGoogleSuggestionList(suggestions,"java selenium","java selenium jobs");
		
//		*************BY DIRECTLY CLICKING ON THE SUGGESTED ELEMENT**************
		
		driver.findElement(By.name("q")).sendKeys("java selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span/b[contains(text(),'interview questions and answers')]")).click();
		
		

	}
	
	public static List<String> googleSuggestionList(By locator,String searchKey) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(searchKey);
		Thread.sleep(3000);
		List<WebElement> suggList=driver.findElements(locator);
		List<String> suggValList=new ArrayList<String>();
		for(WebElement e:suggList) {
			String text=e.getText();
			suggValList.add(text);
			System.out.println(text);
		}
		return suggValList;
	}
		public static void selectGoogleSuggestionList(By locator,String searchKey,String suggvalue) throws InterruptedException {
			driver.findElement(By.name("q")).sendKeys(searchKey);
			Thread.sleep(3000);
			List<WebElement> suggList=driver.findElements(locator);
			for(WebElement e:suggList) {
				String text=e.getText();
				System.out.println(text);
				if(text.contains(suggvalue)) {
					e.click();
					break;
				}
			
		}

}}
