package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		
		By rightClick=By.xpath("//span[text()='right click me']");
		By rightClickOption=By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");
		
		doRightClick(rightClick);
		doWebElementClickFromWebElementList(rightClickOption,"Quit");
		
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	public static void doRightClick(By locator)
	{
		WebElement rightClick=driver.findElement(locator);	
		Actions action=new Actions(driver);
		
		action.contextClick(rightClick).perform();
		
	}
	
	public static void doWebElementClickFromWebElementList(By locator, String value)
	{
		
		List<WebElement> rightClickOptionList=driver.findElements(locator);
		
		for(WebElement e:rightClickOptionList)
		{
			if (e.getText().equals(value))
			{
				e.click();
				break;
			}
		}
	
	}

}
