package SeleniumPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
	
		BrowserUtil brObj=new BrowserUtil();
		WebDriver driver=brObj.launchBrowser();
		brObj.openUrl("https://www.google.com/");
			
		
		WebElementUtil elmObj=new WebElementUtil(driver);
		By input=By.name("q");
		
		elmObj.doElementSendKeys(input, "testing");
		Thread.sleep(3000);
		By search=By.xpath("//ul[@class='erkvQe']/li//div[@class='sbl1']/span");
		elmObj.doLinkClick(search, "testing types");
		
//		List<WebElement> searchList=elmObj.doFindElements(search);
//		
//		for(WebElement e:searchList)
//		{
//		   System.out.println(e.getText());
//		}
//		
//		for(WebElement e:searchList)
//		{
//			if (e.getText().equalsIgnoreCase("testing types"))
//				
//			{
//				e.click();
//				System.out.println("done");
//				break;
//			}
//		}
//	
//		
		
		
	}

}
