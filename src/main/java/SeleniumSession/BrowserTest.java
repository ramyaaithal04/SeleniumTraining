package SeleniumSession;

public class BrowserTest {

	public static void main(String[] args) {
	
		BrowserUtility br=new BrowserUtility();
		br.launchBrowser("chrome");
		br.launchURL("http://google.com");
		String t=br.getPageTitle();
		System.out.println(t);
		String u=br.getUrl();
		System.out.println(u);
		br.closeBrowser();

	}

}
