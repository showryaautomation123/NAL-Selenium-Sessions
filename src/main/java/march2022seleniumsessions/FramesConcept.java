package march2022seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		 driver.findElement(By.cssSelector("#imageTemplateContainer")).click();
		 driver.switchTo().frame(0);
		By year= By.cssSelector("#RESULT_TextField-2");
		By veh_type=By.cssSelector("#RESULT_TextField-3");
		 By veh_modl=By.cssSelector("#RESULT_TextField-4");
		 By color=By.cssSelector("#RESULT_TextField-5");
		 By mileage=By.cssSelector("#RESULT_TextField-6");
		 By vin=By.cssSelector("#RESULT_TextField-7");
		 By name=By.cssSelector("#RESULT_TextField-8");
		 By address1=By.cssSelector("#RESULT_TextField-9");
		 By address2=By.cssSelector("#RESULT_TextField-10");
		 By city=By.cssSelector("#RESULT_TextField-11");
		 By zip=By.cssSelector("#RESULT_TextField-13");
		 By phone=By.cssSelector("#RESULT_TextField-14");
		 By email=By.cssSelector("#RESULT_TextField-15");
		 By state=By.cssSelector("#RESULT_RadioButton-12");
		 
		 doSendKeys(year,"2014");
		 doSendKeys(veh_type,"Honda");
		 doSendKeys(veh_modl,"pilot");
		 doSendKeys(color,"black");
		 doSendKeys(mileage,"20000");
		 doSendKeys(vin,"223478798909");
		 doSendKeys(name,"sana");
		 doSendKeys(address1,"northlake");
		 doSendKeys(address2,"Ashburn");
		 doSendKeys(city,"DC");
		 doSendKeys(zip,"45690");
		 doSendKeys(phone,"983976277");
		 doSendKeys(email,"sana@gmail.com");
		 selectDropDownByVisibleText(state,"Washington DC");
	}
	public static void doSendKeys(By locator ,String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void selectDropDownByVisibleText(By locator,String textvalue) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(textvalue);
		
	}
}
