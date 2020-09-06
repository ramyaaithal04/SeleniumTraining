package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoScoreCard {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/19495/scorecard/1198241/england-vs-pakistan-1st-test-england-v-pakistan-2020");
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='table batsman']")));
		
		String playerName="Asad Shafiq";
		
		System.out.println("Score card of " +playerName+" : " + getScoresOfThePlayer(playerName));
		driver.quit();
		
	}	
    public static ArrayList getScoresOfThePlayer(String playerName)	
    {
    	List<WebElement> scoreWebElements=
  driver.findElements(By.xpath("//a[text()='"+playerName+"' and contains(@title,'View full profile of')]//parent::td//following-sibling::td"));
    			
    	ArrayList scoreValue=new ArrayList();
    	for(WebElement e:scoreWebElements)	
    		if(! e.getText().equals(""))
				scoreValue.add(e.getText());
					
		return scoreValue;	   	
    }
    
    
  //List<WebElement> listOfValues=driver.findElements(By.xpath("//a[text()='JM Anderson']/parent::td[@class='text-nowrap']//following-sibling::td"));
  		//ArrayList scoreValue=new ArrayList();
  		// listOfValues.stream().forEach(ele -> System.out.println(ele.getText()));

  	
}
