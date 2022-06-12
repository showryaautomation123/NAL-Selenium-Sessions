package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 //driver.findElement(By.xpath("//a[text()='Jordan.Mathews']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		 webTableSelect("Garry.White");
		 webTableSelect("Jasmine.Morgan");	
	}

	public static void webTableSelect(String username) {
		 driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

	}
}
