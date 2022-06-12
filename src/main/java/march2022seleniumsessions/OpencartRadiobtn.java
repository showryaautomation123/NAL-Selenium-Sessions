package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartRadiobtn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		String yes=driver.findElement(By.xpath("//label[@class='radio-inline'][1]")).getText();
		System.out.println(yes);
		String no=driver.findElement(By.xpath("//label[@class='radio-inline'][2]")).getText();
		System.out.println(no);

	}

}
