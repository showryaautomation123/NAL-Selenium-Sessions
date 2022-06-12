package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		BrowserUtil brutil=new BrowserUtil();
		WebDriver driver=brutil.init_driver("chrome");
		brutil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
//		System.out.println(brutil.getPageTiltle());
//		System.out.println(brutil.getPageUrl());
		
		//id:
//		By first_name=By.id("input-firstname");
//		By last_name=By.id("input-lastname");
//		By email=By.id("input-email");
//		By tele=By.id("input-telephone");
//		By passwd=By.id("input-password");
//		By passwd_confirm=By.id("input-confirm");
//		
		ElementUtil eleutil = new ElementUtil(driver);
//		
//		eleutil.doSendKeys(first_name, "sara");
//		eleutil.doSendKeys(last_name, "jain");
//		eleutil.doSendKeys(email, "sara@gmail.com");
//		eleutil.doSendKeys(tele, "9849033447");
//		eleutil.doSendKeys(passwd, "sarajain123");
//		eleutil.doSendKeys(passwd_confirm, "sarajain123");
		
		//name
		
		By email=By.name("email");
		eleutil.doSendKeys(email, "sara@gmail.com");
		String placevalue=eleutil.doGetAttribute(email, "value");
		System.out.println(placevalue);
		
		//classname
		By privacy=By.className("agree");
		
		//xpath
		By radio_yes=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By radio_no=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By privacy_policy=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By continue_button=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		System.out.println(eleutil.doGetText(radio_yes));
//		boolean flag_yes=eleutil.isEnabled(radio_yes);
//		boolean flag_no=eleutil.isEnabled(radio_yes);
//		if(flag_no) {
//			eleutil.doClick(radio_no);
//		}
//		
//		boolean privacy_checkbox=eleutil.isDisplayed(privacy_policy);
//		if(privacy_checkbox) {
//			eleutil.doClick(privacy_policy);
//		}
		
		//eleutil.doClick(continue_button);
//		System.out.println(eleutil.doGetText(radio_yes));
//		String text=eleutil.doGetText(privacy);
//		System.out.println(text);
		
		//linktext
		
		By login = By.linkText("login page");
		eleutil.doClick(login);
		
		//cssSelector
		By password=By.cssSelector("#input-password");
		By css_email=By.cssSelector("#input-email");
		if(eleutil.isDisplayed(password)) {
			eleutil.doSendKeys(password, "sara@123");
		}
		if(eleutil.isEnabled(css_email)) {
			eleutil.doSendKeys(css_email, "sara@gmail.com");
		}
		
		//tagname
		
//		By title=By.tagName("h1");
//		String text=eleutil.doGetText(title);
//		System.out.println(text);
		
		
	}

}
