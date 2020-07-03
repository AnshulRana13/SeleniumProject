package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage01 implements IGoogleHomePage {

	private WebDriver _driver = null;
	private By textbox_search = By.xpath("//input[@name='q']");
	private By button_search =  By.name("btnK");
	public GoogleHomePage01(WebDriver driver) {
		this._driver = driver;
	}
	public void setTextInSearchBox(String text) {
		_driver.findElement(textbox_search).sendKeys(text);		
	}

	public void clicksearchButton() {		
		_driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
