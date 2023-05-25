package Project;


	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class BrowserClose {
	    public static void main(String[] args) {
	       
	        
	        WebDriver driver = new ChromeDriver(); 
	        
	    	driver.get("https://www.bestbuy.com/");
	    	WebElement element=driver.findElement(By.linkText("BestBuy e-commerce"));
	    	
	    	//System.out.println(element.getText());
	    }
	        

	       
	        driver.quit();
	    }
	}


