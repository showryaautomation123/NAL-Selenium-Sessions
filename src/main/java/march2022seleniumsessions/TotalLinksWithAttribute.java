package march2022seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinksWithAttribute {
	static WebDriver driver;
	private static List<WebElement> elements;

	public static void main(String[] args) {
		BrowserUtil brutil = new BrowserUtil();
		driver = brutil.init_driver("chrome");

		By links = By.tagName("a");
		By images=By.tagName("img");

		driver.get("https://www.amazon.com/");
//		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
//		int linkslistsize = linkslist.size();
//		System.out.println(linkslistsize);
//		for (WebElement e : linkslist) {
//			String hrefvalue = e.getAttribute("href");
//			System.out.println(hrefvalue);
//		}
//		List<String> hrefAttributeList = getElementsAttribute(links, "href");
//		for (String e : hrefAttributeList) {
//			System.out.println(e);
//			List<String> classlist=getElementsAttribute(links,"class");
//			for(String e:classlist) {
//				System.out.println(e);
//			}
		System.out.println(getElementCount(images));
		List<String>altList=getElementsAttribute(images,"alt");
		for(String e:altList) {
			System.out.println(e);
		}
			
		
			
		}
	

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementCount(By locator) {
		return getElements(locator).size();
	}

	public static List<String> getElementsAttribute(By locator, String attribute) {
		List<WebElement> list = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		for (WebElement e : list) {
			String attributeValue = e.getAttribute(attribute);
			attrList.add(attributeValue);
			// System.out.println(attrList);
		}
		return attrList;
	}

	public static List<String> getElementsText(By locator) {
		List<WebElement> list = getElements(locator);
		List<String> textList = new ArrayList<String>();
		for (WebElement e : list) {
			String etext = e.getText();
			textList.add(etext);
			// System.out.println(attrList);
		}
		return textList;

	}
}
