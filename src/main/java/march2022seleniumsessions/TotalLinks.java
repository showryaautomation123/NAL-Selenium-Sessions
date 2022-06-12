package march2022seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {

	public static void main(String[] args) {
		
		BrowserUtil brutil=new BrowserUtil();
		WebDriver driver=brutil.init_driver("chrome");
		
		driver.get("https://www.amazon.com/");
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		int linkslistsize=linkslist.size();
		System.out.println(linkslistsize);
		
//		for(int i=0;i<linkslistsize;i++) {
//			String text=linkslist.get(i).getText();
//			//System.out.println(text);
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}
//		}
//		for(WebElement e:linkslist) {
//			String text=e.getText();
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}
//			
//		}
		
		//linkslist.stream().forEach(element->System.out.println(element.getText()));
		linkslist.stream().filter(e->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));
		

	}

}
