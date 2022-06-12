package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeDepotPagination {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		driver.get("https://www.homedepot.com/");
		Thread.sleep(1200);
		driver.findElement(By.xpath("//div[@class='promotionalNav2__card'][2]")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//img[@alt=' Refrigerators']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//img[@alt='French door']")).click();
		Thread.sleep(1500);
//		driver.findElement(By.xpath
//				("//div[@class='product-pod__title product-pod__title__product']//span[contains(text(),'500 Series 36 in. 21 cu. ft. French Door Refrigerator in Black')]"));
//		
//		driver.findElement(By.xpath("//a[@aria-label='Next']"));

		int pageNum=1;
		while(true) {
			if(driver.findElements(By.xpath
					("//div[@class='product-pod__title product-pod__title__product']//span[contains(text(),'500 Series 36 in. 21 cu. ft. French Door Refrigerator in Black')]")).size()>0) {
				driver.findElement(By.xpath
						("//div[@class='product-pod__title product-pod__title__product']//span[contains(text(),'500 Series 36 in. 21 cu. ft. French Door Refrigerator in Black')]")).click();
				System.out.println("page num is:  " +pageNum);
				break;
			}
			
			else {
				WebElement next=driver.findElement(By.xpath("(//ul[@class='hd-pagination__wrapper']//a)[last()]"));
				next.click();
				pageNum++;
				}
				
				
			}
		}
	}


