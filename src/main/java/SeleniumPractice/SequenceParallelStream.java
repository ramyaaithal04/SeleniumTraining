package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SequenceParallelStream {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebDriverWait wait=new WebDriverWait(driver,6);
		wait.until(ExpectedConditions.titleContains("India"));
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		long startTime=System.currentTimeMillis();
		
	linkList.stream().parallel().forEach(ele -> System.out.println(ele.getText())) ;
	 linkList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		long endTime=System.currentTimeMillis();
		
		System.out.println();
		
	}

}
