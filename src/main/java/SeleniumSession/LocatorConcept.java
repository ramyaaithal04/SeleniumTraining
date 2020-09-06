package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
//		1.
//		driver.findElement(By.id("username")).sendKeys("ramyaaithal@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("1234");
//		driver.findElement(By.id("loginBtn")).click();
		
//		2.
//		WebElement username=driver.findElement(By.id("username"));
//		username.sendKeys("manjunathca@rediffmail.com");
//		WebElement password=driver.findElement(By.id("password"));
//		password.sendKeys("Sammu@1234");
//		WebElement login=driver.findElement(By.id("loginBtn"));
//		login.click();
		
//		3.
	By username=By.id("username");
	By password=By.id("password");
	By login=By.id("logibBtn");
//		driver.findElement(username).sendKeys("manjunathca@rediffmail.com");
//		driver.findElement(password).sendKeys("Sammu@1234");
//		driver.findElement(login).click();
	doSendKeys(username,"manjunathca@rediffmail.com");
	doSendKeys(password,"Sammu@1234");
	
	}


public static WebElement getElement(By locator)
{
	WebElement element;
	element=driver.findElement(locator);
	return element;
}
public static void doSendKeys(By locator, String value)
{
	WebElement element=getElement(locator);
	element.sendKeys(value);
}

public static void doClick(By locator)
{
	WebElement element=getElement(locator);
	element.click();
}

}