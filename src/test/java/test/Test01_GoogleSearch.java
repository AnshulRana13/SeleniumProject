package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleSearch();

	}
	
	public static void GoogleSearch() {
		String projectPath = System.getProperty("user.dir");
		String value = "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", projectPath + value);
		WebDriver driver = new ChromeDriver();		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java Tutorials");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);		
		driver.close();
		System.out.println("Test Completed Successfully !!!");
	}

}
