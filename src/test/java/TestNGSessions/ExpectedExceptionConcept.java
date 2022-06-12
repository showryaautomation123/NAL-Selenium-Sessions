package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	@Test(expectedExceptions = { ArithmeticException.class,NullPointerException.class})
	public void loginTest() {
		int i=3/0;
		System.out.println("login Test");
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj.name="tom";
		obj=null;
		System.out.println(obj.name);
		//int i=3/0;
		
		
	}
}
