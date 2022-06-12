package march2022seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandleWithList {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> handles=driver.getWindowHandles();
		List<String> handleList=new ArrayList<String>(handles);
		String parentWindowId=handleList.get(0);
		System.out.println(parentWindowId);
		String childWIndowId=handleList.get(1);
		System.out.println(childWIndowId);
		driver.switchTo().window(childWIndowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
