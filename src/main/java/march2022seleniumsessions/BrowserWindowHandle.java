package march2022seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		String parentWindowId=it.next();
//		String childWindowID=it.next();
//		driver.switchTo().window(childWindowID);
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(parentWindowId);
//		System.out.println(driver.getTitle());
//		driver.quit();
		ArrayList<String> list=new ArrayList<String>();
	    String linkedin= "//img[@alt='LinkedIn OrangeHRM group']";
		String facebook="//img[@alt='OrangeHRM on Facebook']";
		String twitter="//img[@alt='OrangeHRM on twitter']";
	    String youtube="//img[@alt='OrangeHRM on youtube']";
	list.add(linkedin);
	list.add(twitter);
	list.add(facebook);
	list.add(youtube);
	browserWindowhandle(list);
		
	}
public static void browserWindowhandle(ArrayList<String> list) {
	for(String e: list) {
	driver.findElement(By.xpath(e)).click();
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	String parentWindowId=it.next();
	String childWindowID=it.next();
	driver.switchTo().window(childWindowID);
	System.out.println(driver.getTitle());
	driver.close();
	driver.switchTo().window(parentWindowId);
	System.out.println(driver.getTitle());

}
	driver.quit();
}

}

