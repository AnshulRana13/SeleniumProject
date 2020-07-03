import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		//Setting Web Driver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ninu\\eclipse-workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		//Opening the driver
		//WebDriver driver = new FirefoxDriver();	
		String projectPath = System.getProperty("user.dir");
		String value = "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", projectPath + value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
