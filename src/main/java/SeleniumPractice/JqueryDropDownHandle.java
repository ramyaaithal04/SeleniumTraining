package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	static WebDriver driver;
	static final String SelectAll = "ALL";

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brObj = new BrowserUtil();

		driver = brObj.launchBrowser();
		WebElementUtil eleObj = new WebElementUtil(driver);
		brObj.openUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);

		By DropDown = By.id("justAnInputBox");
		eleObj.doElementClick(DropDown);
		Thread.sleep(2000);

		By multiSelection = By.xpath("//span[@class='comboTreeItemTitle']");
		eleObj.SelectJqueryDropDown(multiSelection, WebElementUtil.SelectAll);

		//SelectJqueryDropDown(multiSelection, "choice 6 2 3");
		Thread.sleep(4000);
		brObj.quitBrowser();
		//SelectJqueryDropDown(multiSelection, JqueryDropDownHandle.SelectAll);
		// SelectJqueryDropDown(multiSelection, "choice 6 1", "choice 2 1");
		
		
		// WebDriverManager.chromedriver().setup();
		// driver=new ChromeDriver();
		// driver. .get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		// Thread.sleep(2000);

		// driver.findElement(By.id("justAnInputBox")).click();

		// Thread.sleep(3000);

		// List<WebElement>
		// optionList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	}

	public static void SelectJqueryDropDown(By locator, String... value) {
		List<WebElement> optionList = driver.findElements(locator);
		if (value[0].contentEquals(JqueryDropDownHandle.SelectAll)) {
			try {
				for (WebElement e : optionList)
					e.click();

			} catch (Exception e) {

			}
		}

		else {
			for (int i = 0; i < value.length; i++) {
				for (WebElement e : optionList) {
					if (e.getText().equals(value[i])) {
						e.click();
						break;
					}
				}
			}
		}
	}

}
