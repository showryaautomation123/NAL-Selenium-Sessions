package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablePagination {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		driver.get("https://selectorshub.com/xpath-practice-page/");
		int pageNumber=1;
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='Troy']")).size()>0) {
				selectCity("Troy");
				System.out.println("page number: "+pageNumber);
				break;
			}
			
			else {
				WebElement next=driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("no records found-pagination is over");
					break;
				}
				next.click();
				pageNumber++;
			}
		}
	}
	
	public static void selectCity(String cityName) {
		driver.findElement(By.xpath("//td[text()='"+cityName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}

}
