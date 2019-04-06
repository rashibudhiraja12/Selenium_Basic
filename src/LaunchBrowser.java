
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step Lanuch the Browser:
		// selenium
		WebDriver wd = new ChromeDriver();
		// Open a particular URL:
		wd.get("https://www.google.com"); //get 

		String pageTitle = wd.getTitle(); //Capture the title of the page getTitle
		System.out.println(pageTitle);

		String currentUrl = wd.getCurrentUrl();// Capture the url of the page: getCurrentUrl
		System.out.println(currentUrl);

//		String pageSourse=wd.getPageSource();
//		System.out.println(pageSourse);

		wd.get("https://www.facebook.com");
		currentUrl = wd.getCurrentUrl();
		System.out.println(currentUrl);

		wd.navigate().back();   //Navigation Back: wd.navigate.back
		currentUrl = wd.getCurrentUrl();
		System.out.println(currentUrl);
 
		wd.navigate().forward();   //Navigation Forward: wd.navigate.forward
		currentUrl = wd.getCurrentUrl();
		System.out.println(currentUrl);

		// wd.close(); // Closes the current tab opened by the webdriver
		wd.quit(); // closes all the tabs opened by the webdriver

	}

}
