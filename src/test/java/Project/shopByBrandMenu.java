package Project;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class shopByBrandMenu {
	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN PULLAPALLY\\eclipse-workspace\\AUT5\\src\\test\\java\\Project\\shopByBrandMenu.java");

	      
	        WebDriver driver = new ChromeDriver();

	
	        driver.get("https://www.bestbuy.com/"); 
	      
	        WebElement brandMenu = driver.findElement(By.id("data-id=\"node-87\""));

	       
	        brandMenu.click();

	       
	        WebElement selectAnyBrandOption = driver.findElement(By.linkText("https://www.bestbuy.com/site/brands/lenovo/pcmcat230600050000.c?id=pcmcat230600050000")); 

	        
	        selectAnyBrandOption.click();
	       
	        WebElement desiredBrand = driver.findElement(By.linkText("Lenovo")); 
	  
	        desiredBrand.click();
	   
	        WebElement desiredItem = driver.findElement(By.linkText("https://www.bestbuy.com/site/lenovo-ideapad-flex-5-15itl05-2-in-1-15-6-laptop-intel-core-i5-with-8gb-memory-256-gb-ssd-graphite-gray/6502662.p?skuId=6502662")); 

	      
	        desiredItem.click();

	        
	        WebElement addToCartButton = driver.findElement(By.id("id=\"fulfillment-add-to-cart-button-54453237"));

	        
	        addToCartButton.click();
	       
	        driver.quit();
	    }
	}

