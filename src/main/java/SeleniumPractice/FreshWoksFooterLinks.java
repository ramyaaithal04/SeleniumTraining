package SeleniumPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreshWoksFooterLinks {

	public static void main(String[] args) {

		String text;
		BrowserUtil brObj=new BrowserUtil();
		WebDriver driver=brObj.launchBrowser();
		brObj.openUrl("https://www.freshworks.com/");
	
		WebElementUtil elmObj=new WebElementUtil(driver);
		By footLinks=By.xpath("//footer//li");
		List<WebElement> footerlinks=elmObj.doFindElements(footLinks);
		
		for(int i=0;i<footerlinks.size();i++)
		{
			
			text=footerlinks.get(i).getText();
			if (! text.isEmpty())
			{
				System.out.println(i+" - "+text);
			}
		}

	}

}
