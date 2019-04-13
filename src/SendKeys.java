import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();
		// Open a particular URL:
		wd.get("https://www.google.com"); // g
		WebElement searchBox = wd.findElement(By.xpath("//input[@name=\"q\"]")); // returns a webElement
		searchBox.sendKeys("Test Automation Academy");
		searchBox.sendKeys(Keys.ENTER);
		
		wd.findElement(By.id("email"));
		
		//input[@value="Log In"]
	}

}
