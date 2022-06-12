package Xpath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
//		 List<WebElement> list = driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
//		 System.out.println(list.size());
//		 for(WebElement e:list) {
//				 System.out.println( e.getText());
//	} 
				 List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
				 List<WebElement> colList = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
				//WebElement col1=driver.findElement(By.xpath("//table[@id='customers']//tr/th"));
				 System.out.println(rowList.size());
				 System.out.println(colList.size());
				List<WebElement> rowElementsList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
				System.out.println(rowElementsList.size());
			
			
				
				for(int j=0;j<rowElementsList.size();j++) {
					
					String rowvalues=rowElementsList.get(j).getText();
					
					System.out.println(rowvalues);
				}
				
//				for(int i=0;i<=0;i++) {
//					String colvalues=colList.get(i).getText();
//					for(int j=0;j<rowList.size();j++) {
//						String rowvalues=rowList.get(j).getText();
//						System.out.println(rowvalues);
//					}
//				}
//				for(WebElement e:rowElementsList) {
//					System.out.println(e.getText());
//				}
//		 
	}

}
