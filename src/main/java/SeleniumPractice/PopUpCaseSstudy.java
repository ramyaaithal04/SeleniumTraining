package SeleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpCaseSstudy {
	
	static WebDriver driver;
	public static void main(String[] args) {		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		linkClick("Good PopUp #1");
		linkClick("Good PopUp #2");
		linkClick("Good PopUp #3");
		linkClick("Good PopUp #4");
		getWindowsTitles();
		
		linkClick("Good PopUp #1");
		getWindowsTitles();
		linkClick("Good PopUp #2");
		getWindowsTitles();
		linkClick("Good PopUp #3");
		getWindowsTitles();
        linkClick("Good PopUp #4");		
		driver.quit();				
	}
public static void getWindowsTitles(){			
		Set<String> popUps=driver.getWindowHandles();
		System.out.println("Total windows :"+popUps.size());
		Iterator<String> it=popUps.iterator();
		String ParentWindowId=it.next();		
		while(it.hasNext()){
			String childWindowId=it.next();
			driver.switchTo().window(childWindowId);
			System.out.println("Child Window Id :"+childWindowId+"  Window Title :"+driver.getTitle());
			driver.close();
		}
		driver.switchTo().window(ParentWindowId);
		System.out.println("Parent Window Id :"+ParentWindowId+"  Window Title :"+driver.getTitle());
	 
	}

public static void linkClick(String linkText){
		driver.findElement(By.linkText(linkText)).click();
}

}
