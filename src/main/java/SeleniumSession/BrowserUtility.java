package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	
	public WebDriver driver;
	/**
	 * 
	 * @param brName
	 * @return
	 */
	
	public WebDriver launchBrowser(String brName)
	{
		if (brName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if (brName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if (brName.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
			
		}
		else
		{
			System.out.println("Enter valid browser");
		}
		return driver;
	}
	
	/**
	 * 
	 * @param url
	 */
	public void launchURL(String url)
	{
		driver.get(url);
	}
	/**
	 * 
	 * @return
	 */
	public String getPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	/**
	 * 
	 * @return
	 */
	public String getUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
/**
 * 
 */
	public void quitBrowser()
	{
		driver.quit();
	}
	/**
	 * 
	 */
	public void closeBrowser()
	{
		driver.close();
	}
	
}
