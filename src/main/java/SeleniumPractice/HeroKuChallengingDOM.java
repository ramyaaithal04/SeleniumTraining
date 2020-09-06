package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HeroKuChallengingDOM {

	 static WebDriver driver;
	
	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/challenging_dom");
		Thread.sleep(3000);
		
	    System.out.println(driver.findElement(By.xpath("//canvas")).getText());
	    
	    
		
	 }

}
