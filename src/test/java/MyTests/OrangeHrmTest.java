package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest {

	
	@Test(description = "******checking the page title of OrangeHrm********")
	public void pageTitleTest() {
		
		String title=driver.getTitle();
		Assert.assertEquals(title,"Sign Up for a Free HR Software Trial | OrangeHRM");
	}
	
	@Test(description = "*******checking the url contains orangehrm*********")
	public void pageurlTest() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrm"));
	}
	
	@Test(description = "*******checking the usernmefield of orangehrm**********")
	public void searchExistTest(){
		boolean flag=driver.findElement(By.xpath("//input[@id='Form_submitForm_subdomain']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
}
