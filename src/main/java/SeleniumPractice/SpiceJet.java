package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		By addonMenu = By.id("highlight-addons");
		By subMenu = By.linkText("Friends and Family");
		
		// twoLevelMenuHandling(addonMenu, subMenu);
				
		By level1Menu=By.id("ctl00_HyperLinkLogin");
		By level2Menu=By.linkText("SpiceClub Members");
		By level3Menu=By.linkText("Member Login");
		
		threeLevelMenuHandling(level1Menu,level2Menu,level3Menu);		
		Thread.sleep(4000);
		driver.quit();
	}

	public static void twoLevelMenuHandling(By mainMenu, By subMenu) throws InterruptedException {
		WebElement mainMenuElement = driver.findElement(mainMenu);
		Actions action = new Actions(driver);
		action.moveToElement(mainMenuElement).perform();
		Thread.sleep(3000);
		driver.findElement(subMenu).click();
	}
	
	public static void threeLevelMenuHandling(By level1Menu, By level2Menu, By level3Menu) throws InterruptedException {
		WebElement firstMenuElement = driver.findElement(level1Menu);
		Actions action = new Actions(driver);
		action.moveToElement(firstMenuElement).perform();
		Thread.sleep(3000);		
		WebElement secondMenuElement = driver.findElement(level2Menu);
		action.moveToElement(secondMenuElement).perform();
		Thread.sleep(3000);
		driver.findElement(level3Menu).click();		
	}
}



//By.xpath("//ul[@class='add-ons-tab']/li/a[contains(@href, 'aspx')]");
//twoLevelMenuHandling(addonMenu, subMenu, "Student Discount");
//public static void twoLevelMenuHandling(By mainMenu, By subMenu, String value) throws InterruptedException {
//
//	WebElement mainMenuElement = driver.findElement(mainMenu);
//	Actions action = new Actions(driver);
//	action.moveToElement(mainMenuElement).perform();
//
//	Thread.sleep(3000);
//
//	List<WebElement> subMenuList = driver.findElements(subMenu);
//
//	for (WebElement e : subMenuList)
//
//		if (e.getText().equals(value)) {
//			e.click();
//			break;
//		}

//}
