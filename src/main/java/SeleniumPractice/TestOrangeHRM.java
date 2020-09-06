package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brObj=new BrowserUtil();
		WebDriver driver=brObj.launchBrowser();
		
		brObj.openUrl("https://www.orangehrm.com");
		Thread.sleep(3000);
		System.out.println("The title of the page -"+brObj.getTitle());
		
		WebElementUtil elementObj=new WebElementUtil(driver);
		
		By ThirtyDayTrailLink=By.linkText("FREE 30 Day Trial");
		By url=By.id("Form_submitForm_subdomain");		
		By firstName=By.id("Form_submitForm_FirstName");
		By lastName=By.id("Form_submitForm_LastName");
		By email=By.name("Email");
		By jobTitle=By.id("Form_submitForm_JobTitle");
		By noOfEmployees=By.name("NoOfEmployees");
		By companyName=By.xpath("//*[@id='Form_submitForm_CompanyName']");
		By industry=By.cssSelector("#Form_submitForm_Industry");
		By phoneNo=By.id("Form_submitForm_Contact");
		By country=By.xpath("//*[@id=\'Form_submitForm_Country\']");	
		By state=By.id("Form_submitForm_State");
		
		elementObj.doElementClick(ThirtyDayTrailLink);
		elementObj.doElementSendKeys(url, "www.google.com");
	    elementObj.doElementSendKeys(firstName, "AAAA");		
	    elementObj.doElementSendKeys(lastName, "BBBB");	
	    elementObj.doElementSendKeys(email, "test@gmail.com");	
	    elementObj.doElementSendKeys(jobTitle, "TestEngineer");	
	    elementObj.doSelectDropDownByVisibleText(noOfEmployees, "0 - 10");
	    elementObj.doElementSendKeys(companyName, "XYZ Company");	
	    elementObj.doSelectDropDownByValue(industry, "Education"); 
	    elementObj.doElementSendKeys(phoneNo, "9877897652");	
	    elementObj.doSelectDropDownByVisibleText(country, "India");
	    elementObj.doSelectDropDownByIndex(state, 12);
	    
	    System.out.println("The form is filled.");
	    brObj.quitBrowser();
	   
	    
	}

}
