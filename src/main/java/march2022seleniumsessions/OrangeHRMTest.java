package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMTest {

	public static void main(String[] args) {
		BrowserUtil brutil=new BrowserUtil();
		WebDriver driver=brutil.init_driver("chrome");
		brutil.launchUrl("https://www.orangehrm.com/contact-sales/");
		
//		By full_name=By.id("Form_submitForm_FullName");
//		By company_name=By.id("Form_submitForm_CompanyName");
//		By job_title=By.id("Form_submitForm_JobTitle");
//		By email=By.id("Form_submitForm_Email");
//		By ph_number=By.id("Form_submitForm_Contact");
//		By comment=By.id("Form_submitForm_Comment");
//		
//		 ElementUtil eleutil=new ElementUtil(driver);
//		 eleutil.doSendKeys(full_name, "tina");
//		 eleutil.doSendKeys(company_name, "amazon");
//		 eleutil.doSendKeys(job_title, "QA");
//		 eleutil.doSendKeys(email, "tina@gmail.com");
//		 eleutil.doSendKeys(ph_number, "8291767920");
//		 eleutil.doSendKeys(comment, "user friendly application");
		
		String full_name="Form_submitForm_FullName";
		String company_name="Form_submitForm_CompanyName";
		String job_title="Form_submitForm_JobTitle";
		String email="Form_submitForm_Email";
		String ph_number="Form_submitForm_Contact";
		String comment="Form_submitForm_Comment";
		
		 ElementUtil eleutil=new ElementUtil(driver);
		
		

	}

}
