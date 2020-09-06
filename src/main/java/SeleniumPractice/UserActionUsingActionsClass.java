package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActionUsingActionsClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(3000);
		
		By username=By.name("username");
		By password=By.name("password");
		By login=By.xpath("//input[@type='submit']");
		
		doSendKeysUsingActions(username,"batchautomation");
		doSendKeysUsingActions(password,"Test@12345");
		doClickUsingActions(login);
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	public static void doSendKeysUsingActions(By locator, String value)
	{
		Actions action=new Actions(driver);		
		action.sendKeys(driver.findElement(locator), value).perform();
	}
	
	public static void doClickUsingActions(By locator){
		
		Actions action=new Actions(driver);		
		action.click(driver.findElement(locator)).perform();
		
		
	}

}
