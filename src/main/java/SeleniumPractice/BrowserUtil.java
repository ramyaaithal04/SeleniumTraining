package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserUtil {
	
	public WebDriver driver;
	
	/**
	 * method to launch the browser
	 * @returns WebDriver
	 */
	public WebDriver launchBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	
	/**
	 * method to open the URL
	 * @param url
	 */
	public void openUrl(String url)
	{
		driver.get(url);
	}
	
	/**
	 * method to get the title of the page
	 * @returns String
	 */
	
	public String getTitle()	
	{
		String title;
		title=driver.getTitle();
		return title;
	}
	
	/**
	 * method to close the browser
	 */
	public void closeBrowser()
	{
		driver.close();
	}
	
	/**
	 * method to quit the browser
	 */
	public void quitBrowser()
	{
		driver.quit();
	}
}
