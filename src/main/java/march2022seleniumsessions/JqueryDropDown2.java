package march2022seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropDown2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");
		driver.get("http://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox1")).click();
		//List<WebElement> list = driver.findElements(By.xpath("(//div[contains(@id,'DropDownContainer')])[2]//li/span[@class='comboTreeItemTitle']"));
		//System.out.println(list.size());
		//By locator=By.xpath("//h3[text()='Multi Selection With Cascade Option Select']/parent::div//div[@class='comboTreeDropDownContainer']/ul/li/span[@class='comboTreeItemTitle']");
		By locator=By.xpath("((//div[@class='comboTreeDropDownContainer'])[2]/ul)[1]/li/span[@class='comboTreeItemTitle']");
		List<WebElement> list = driver.findElements(locator);
		System.out.println(list.size());
		for(WebElement e:list) {
			
			System.out.println(e.getText());
				e.click();
				//Thread.sleep(1000);
			}
		
		
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
//		else{
//			for(WebElement e:list) {
//		
//			String text=e.getText();
//			System.out.println(text);
//			
//			for(int i=0;i<value.length;i++) {
//				if(text.contains(value[i])) {
//					flag=true;
//					e.click();
//					break;
//				}
//			}
//			
//		}
//	}
		if(flag==false) {
			System.out.println("choice is not availble "+value[0]);
		}


		
		
	}}
	
	


