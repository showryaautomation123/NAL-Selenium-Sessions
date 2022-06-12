package MyTests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{
	
	@DataProvider
	public Object[][] getRegistrationData() {
		return new Object[][] {
			{"sara","sen","sara@gmail.com","918938363","sara123","sara123","Yes"},
			{"tim","shepard","time@gmail.com","567828992","tim123","tim123","No"},
			{"lynn","young","lynn@gmail.com","5678940404","lynn123","lynn123","Yes"}
		};
		
		
	}
	
	@Test(dataProvider="getRegistrationData")
	public void registrationTest(String firstName,String lastName,String email,String phnumber,String passwd,String pwdconfirm,String subscribe) {
		doRegistartion(firstName,lastName,email,phnumber,passwd,pwdconfirm,subscribe);
	}
	
	
	public void doRegistartion(String firstName,String lastName,String email,String phnumber,String passwd,String pwdconfirm,String subscribe) {
		driver.findElement(By.cssSelector("#input-firstname")).clear();
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys(firstName);
		driver.findElement(By.cssSelector("#input-lastname")).clear();
		driver.findElement(By.cssSelector("#input-lastname")).sendKeys(lastName);
		driver.findElement(By.cssSelector("#input-email")).clear();
		driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#input-telephone")).clear();
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys(phnumber);
		driver.findElement(By.cssSelector("#input-password")).clear();
		driver.findElement(By.cssSelector("#input-password")).sendKeys(passwd);
		driver.findElement(By.cssSelector("#input-confirm")).clear();
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys(pwdconfirm);
		String yes=driver.findElement(By.xpath("//label[@class='radio-inline'][1]")).getText();
		String no=driver.findElement(By.xpath("//label[@class='radio-inline'][2]")).getText();
		if(subscribe.equalsIgnoreCase(yes)) {
			driver.findElement(By.xpath("//label[@class='radio-inline'][1]")).click();
		}
		else {
			driver.findElement(By.xpath("//label[@class='radio-inline'][2]")).click();
		}
	}

}
