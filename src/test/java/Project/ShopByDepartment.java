package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopByDepartment {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVAN PULLAPALLY\\eclipse-workspace\\AUT5\\src\\test\\java\\Project\\ShopByDepartment.java"); 
     
        WebDriver driver = new ChromeDriver();

     
        driver.get("https://www.bestbuy.com/"); 

      
        WebElement shopByDepartmentMenu = driver.findElement(By.id("id=\"headerskip\""));

        
        Actions actions = new Actions(driver);
        actions.moveToElement(shopByDepartmentMenu).perform(); 
        
        WebElement desiredDepartment = driver.findElement(By.linkText("https://www.bestbuy.com/site/mobile-cell-phones/iphone/pcmcat305200050000.c?id=pcmcat305200050000")); 

       
        desiredDepartment.click();
       
        WebElement desiredItem = driver.findElement(By.linkText("iphone"));

       
        desiredItem.click();

       
        driver.quit();
    }
}

// Find the "Add to Cart" button
//WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));

// Click on the "Add to Cart" button
//addToCartButton.click();
// Quit the WebDriver
