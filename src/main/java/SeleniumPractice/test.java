package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ndtv.com/coronavirus/india-covid-19-tracker");
		

		WebDriverWait wait=new WebDriverWait(driver,10);		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(text(),'Get')]")));
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
	
		WebElement h1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Coronavirus Outbreak | India Cases']")));
		System.out.println(h1.getText());
			
		driver.switchTo().frame("t5");
		//List<WebElement> list1=driver.findElements(By.xpath("//table[@class='ind-mp_tbl sortable']//td[text()='Maharashtra']//following-sibling::td//span"));
	    List<WebElement> list1=driver.findElements(By.xpath("//table[@class='ind-mp_tbl sortable']//td[text()='Maharashtra']//following-sibling::td//p"));
		list1.stream().forEach(ele -> System.out.println(ele.getText()));
	    
		System.out.println(list1.size());
		
		driver.switchTo().defaultContent();
	 
	    driver.quit();
	
	}

}
