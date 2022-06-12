package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropDownConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		driver.get("http://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
//		 List<WebElement>list = driver.findElements(By.xpath("(//div[contains(@id,'DropDownContainer')])[1]/ul//span[@class=\"comboTreeItemTitle\"]"));
//		 System.out.println(list.size());
		 By choices=By.xpath("(//div[contains(@id,'DropDownContainer')])[1]/ul//span[@class=\"comboTreeItemTitle\"]");
//		for(WebElement e:list) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.contains("choice 3")) {
//				e.click();
//			}
//		}
		 //******SINGLE SELECTION******
//		 selectChoice(choices,"choice 3");
//		 selectChoice(choices, "choice 6 2 1");
//		 selectChoice(choices,"choice 6 2 2");
		 
		 //*********MULTI SELECTION***********
		// selectChoice(choices,"choice 6 2 2","choice 6 2 1","choice 3");
		 
		 //******** ALL SELECTION***********
		 selectChoice(choices,"all");
		 
		 
	}
	public static void selectChoice(By locator,String... value) {
		List<WebElement>list = driver.findElements(locator);
		System.out.println(list.size());
		boolean flag=false;
		if(value[0].equalsIgnoreCase("all")) {
			for(WebElement e:list) {
				flag=true;
				e.click();
			}
		}
		else{
			for(WebElement e:list) {
		
			String text=e.getText();
			System.out.println(text);
			
			for(int i=0;i<value.length;i++) {
				if(text.contains(value[i])) {
					flag=true;
					e.click();
					break;
				}
			}
			
		}
	}
		if(flag==false) {
			System.out.println("choice is not availble "+value[0]);
		}

}}
