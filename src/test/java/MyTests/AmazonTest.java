package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
	
	
	@Test(description = "******checking the page title of amazon********")
	public void pageTitleTest() {
		
		String title=driver.getTitle();
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
	}
	
	@Test(description = "*******checking the url contains amazon*********")
	public void pageurlTest() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("amazon"));
	}
	
	@Test(description = "*******checking the search field on amazon**********")
	public void searchExistTest(){
		boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}
	

}
