package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void DBconnection() {
		System.out.println("BS-DBconnection");
	}
	
	@BeforeTest
	public void createuser() {
		System.out.println("BS-create user test");
	}
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("BC-launch browser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM-logintoapp");
	}
	
	@Test(priority = 0)
	public void userinfoTest() {
		System.out.println("Test-userinfoTest");
	}
	
	@Test(priority = 1)
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test(priority = 2)
	public void getPageTitleTest() {
		System.out.println("page title test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM-logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-close browser");
	}
	
	@AfterTest
	public void deleteuser() {
		System.out.println("AT-delete user");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS-disconnect DB");
	}
}
