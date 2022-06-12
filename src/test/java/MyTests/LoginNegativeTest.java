package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest{
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			{"testing @gmail.com","testing123"},
			{"testing@gmail.com"," "},
			{"  ","  "},
			{"  ","testing123"}
		};
	}
	
	@Test(dataProvider="getLoginData")
	public void loginTest(String un,String pwd) {
		boolean flag=dologin(un,pwd);
		Assert.assertTrue(flag);
	}
	
	
	public boolean dologin(String un,String pwd) {
		driver.findElement(By.cssSelector("#input-email")).clear();
		driver.findElement(By.cssSelector("#input-email")).sendKeys(un);
		driver.findElement(By.cssSelector("#input-password")).clear();
		driver.findElement(By.cssSelector("#input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String erroeMessage=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		if(erroeMessage.contains("No match for E-Mail Address and/or Password")) {
			return true;
		}
		return false;
	}

}
