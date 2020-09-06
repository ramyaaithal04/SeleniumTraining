package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageOption {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brObj=new BrowserUtil();

		WebDriver driver=brObj.launchBrowser();
		brObj.openUrl("https://www.google.co.in");
		By language=By.xpath("//div[@id=\"SIvCob\"]/a");
		
		WebElementUtil eleObj=new WebElementUtil(driver);
		eleObj.doLinkClick(language, "ಕನ್ನಡ");
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.co.in");
//		Thread.sleep(3000);
//		List<WebElement> listOfLanguages = driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));
		
//		listOfLanguages.stream()
//		               .filter(lang -> lang.getText().equals("ಕನ್ನಡ"))
//		               .
////		             
//		for(WebElement e:listOfLanguages)
//		{
//			if (e.getText().equalsIgnoreCase("ಕನ್ನಡ"))
//			{
//				e.click();
//				break;
//				
//			}
//		}
		
		
				
	}

}
