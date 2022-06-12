package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	@Test(description = "******checking the page title of Google********")
	public void pageTitleTest() {
		
		String title=driver.getTitle();
		Assert.assertEquals(title,"Google");
	}
	
	@Test(description = "*******checking the url contains google*********")
	public void pageurlTest() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}
	
	@Test(description = "*******checking the searchfield of google**********")
	public void searchExistTest(){
		boolean flag=driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	

}
