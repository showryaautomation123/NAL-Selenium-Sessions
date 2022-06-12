package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	BrowserUtil brutil = new BrowserUtil();
	driver = brutil.init_driver("chrome");
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\kiran\\Desktop\\shrihan\\images.jpg");
	}

}
