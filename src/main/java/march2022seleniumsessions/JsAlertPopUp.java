package march2022seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlertPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	BrowserUtil brutil = new BrowserUtil();
	driver = brutil.init_driver("chrome");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept(); //clicks on OK
		//alert.dismiss();//clicks on cancel

	}

}