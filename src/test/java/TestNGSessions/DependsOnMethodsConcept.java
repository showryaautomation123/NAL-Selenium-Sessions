package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	@Test
	public void loginTest() {
		System.out.println("login Test");
		int i=9/0;
	}

	@Test(dependsOnMethods="loginTest")
	public void doSearchTest() {
		System.out.println("search test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void getTitleTest() {
		System.out.println("page title test");
	}
}
