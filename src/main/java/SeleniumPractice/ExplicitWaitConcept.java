package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

		static ChromeDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	
		
		driver.get("https://app.hubspot.com/login");
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver,10);
		
		By username=By.id("username");
		waitForElementPresent(username, 5).sendKeys("test");
		
		driver.findElement(By.id("password")).sendKeys("psss");;
		driver.findElement(By.id("loginbtn")).click();;
		
		
		//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		//System.out.println(driver.getTitle());
		//wait.untill(ExpectedConditions.presenceOfElementLocated(username));
			
		
	}

	
	public static WebElement waitForElementPresent(By locator, int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static String waitForTitlePresent(String title, int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
				
	}

}
