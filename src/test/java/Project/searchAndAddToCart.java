package Project;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	public class searchAndAddToCart {
	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.chrome.driver", "https://www.bestbuy.com/?intl=nosplash"); 
	        ChromeOptions options=new ChromeOptions();
	    	options.addArguments("--remote-allow-origins=*");
	        
	        WebDriver driver = new ChromeDriver(options);

	        
	        driver.get("https://www.bestbuy.com/cart"); 
	      
	        WebElement searchInput = driver.findElement(By.id("id=\"shop-product-title-31071403\""));

	   
	        searchInput.sendKeys("Appleipad 64Gb");

	     
	        searchInput.submit();
	   
	        WebElement itemLink = driver.findElement(By.linkText("Apple - 10.2-Inch iPad with Wi-Fi - 64GB - Space Gray")); 

	       
	        itemLink.click();
	      
	        WebElement addToCartButton = driver.findElement(By.id("id=\"fulfillment-add-to-cart-button-23253189\""));

	       
	        addToCartButton.click();
	        
	        driver.quit();
	    }
	}
	
