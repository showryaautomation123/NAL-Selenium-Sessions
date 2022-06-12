package march2022seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		 
		 By contactSales=By.xpath("//a[text()='Contact Sales']");
		 By submit=By.id("Form_submitForm_action_request");
		 //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		 //driver.findElement(contactSales).click();
		 driver.findElement(submit).click();

	}

}
