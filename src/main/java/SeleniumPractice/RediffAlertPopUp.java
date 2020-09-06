package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		
		driver.findElement(By.name("proceed")).click();		
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());	
		alert.accept();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
	    driver.findElement(By.id("login1")).sendKeys("Ramya");	    
	    Thread.sleep(4000);
		
		driver.quit();
		
	}

}
