package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleNavigationTC {
	@Test
	public void navToGoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://snapdeal.com");
		driver.get("https://flipkart.com");
		driver.get("https://Vinayaka.com");
		Thread.sleep(6000);
		driver.quit();
	}
}