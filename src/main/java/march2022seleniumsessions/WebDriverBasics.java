package march2022seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Amazon")){
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
		
	}

}
