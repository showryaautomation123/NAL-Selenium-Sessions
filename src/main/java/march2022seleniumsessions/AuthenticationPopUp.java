package march2022seleniumsessions;

import org.openqa.selenium.WebDriver;

public class AuthenticationPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	BrowserUtil brutil = new BrowserUtil();
	driver = brutil.init_driver("chrome");
	String username="admin";
	String password="admin";
	

		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
	}

}
