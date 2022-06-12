package march2022seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	private WebDriver driver;
	
	public WebDriver init_driver(String browsername) {
		System.out.println(browsername);
		if(browsername.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\kiran\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\kiran\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
			 driver=new FirefoxDriver();
		}
		else {
			System.out.println("enter correct browser name:"+browsername);
		}
			return driver;
				
	}
	
	public void launchUrl(String url) {
		
		if(url==null) {
			System.out.println("url is null");
			return;
		}
		if(url.indexOf("http")==-1||url.indexOf("https")==-1) {
			System.out.println("http(s) is missing in the url");
		}
		
		driver.get(url);
	}
	
	public String getPageTiltle() {
		return driver.getTitle();
	}
	public String getPageUrl(){
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
