package march2022seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4xWindow {


	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 String parentWindowId=driver.getWindowHandle();
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.navigate().to("https://www.amazon.com");
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 driver.switchTo().window(parentWindowId);
		 System.out.println(driver.getTitle());
		 driver.quit();
	}

}
