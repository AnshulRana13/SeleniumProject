package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {

	private WebDriver _driver;
	public GoogleHomePage(WebDriver driver) {
		this._driver = driver;
	}
	public WebElement textbox_search() {
		return _driver.findElement(By.xpath("//input[@name='q']"));

	}
	public WebElement button_search() {
		return _driver.findElement(By.name("btnK"));

	}


}
