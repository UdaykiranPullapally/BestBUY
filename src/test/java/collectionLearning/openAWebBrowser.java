package collectionLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openAWebBrowser {
	@Test
public void webbrowser() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement Element=driver.findElement(By.name("Bestbuy E-commerce"));
		driver.get("https://www.bestbuy.com/");
		System.out.println();
	
}
}
