package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.IGoogleHomePage;
import Pages.GoogleHomePage01;
public class GoogleSearchPageTest {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		GoogleSearchTest();
	}

	public static void GoogleSearchTest() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		String value = "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", projectPath + value);
		driver = new ChromeDriver();		
		driver.get("https://google.com");			
		IGoogleHomePage ghome = new GoogleHomePage01(driver);
		ghome.setTextInSearchBox("Java Tutorials");
		ghome.clicksearchButton();
		Thread.sleep(3000);
		driver.close();

	}


}
