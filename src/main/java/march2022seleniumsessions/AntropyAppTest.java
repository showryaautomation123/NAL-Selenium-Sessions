package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AntropyAppTest {

	public static void main(String[] args) {
		BrowserUtil bu=new BrowserUtil();
		WebDriver driver=bu.init_driver("chrome");
		
		bu.launchUrl(null);
	
//		bu.launchUrl("http://opencart.antropy.co.uk/index.php?route=account/register");
//		
//		By first_name=By.id("input-firstname");
//		By last_name=By.id("input-lastname");
//		By email=By.id("input-email");
//		By tele=By.id("input-telephone");
//		By faxnum=By.id("input-fax");
//		By company_name=By.id("input-company");
//		By address_1=By.id("input-address-1");
//		By address_2=By.id("input-address-2");
//		By city=By.id("input-city");
//		By post_code=By.id("input-postcode");
//		By passwd=By.id("input-password");
//		By passwd_confirm=By.id("input-confirm");
//		
//		ElementUtil eleutil=new ElementUtil(driver);
//		
//		eleutil.doSendKeys(first_name, "sara");
//		eleutil.doSendKeys(last_name, "jain");
//		eleutil.doSendKeys(email, "sara@gmail.com");
//		eleutil.doSendKeys(tele, "9849033447");
//		eleutil.doSendKeys(faxnum, "4567");
//		eleutil.doSendKeys(company_name, "Google");
//		eleutil.doSendKeys(address_1, "charlie lane");
//		eleutil.doSendKeys(address_2, "eagan");
//		eleutil.doSendKeys(city, "NewYork");
//		eleutil.doSendKeys(post_code, "45678");
//		eleutil.doSendKeys(passwd, "sarajain123");
//		eleutil.doSendKeys(passwd_confirm, "sarajain123");
//		
		
				
		
	}

}
