package Project;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	public class SignupAndLoginFunctionality {
		@Test
	    public static void main(String[]args){
	       
	        System.setProperty("webdriver.chrome.driver", "\"/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[8]/button\""); // Replace with your actual path

	    
	        WebDriver driver = new ChromeDriver();

	      
	        driver.get("https://www.bestbuy.com/identity/newAccount?token=tid%3Ae6c3c0bb-fab0-11ed-b9a5-0a9ef3dc1423"); // Replace with the actual URL of the website
	     
	        WebElement signupButton = driver.findElement(By.id("id=\"google-signin-button\""));
	        signupButton.click();

	       
	        WebElement nameInput = driver.findElement(By.id("u_0_b_z8"));
	        WebElement emailInput = driver.findElement(By.id("id=\"u_0_g_bC\""));
	        WebElement passwordInput = driver.findElement(By.id("id=\"password_step_input\""));
	        WebElement signupSubmitButton = driver.findElement(By.id("id=\"u_0_t_ma"));

	        nameInput.sendKeys("UdayKiran");
	        emailInput.sendKeys("udaykiran.1129@gmail.com");
	        passwordInput.sendKeys("password123");
	        signupSubmitButton.click();
	      
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        WebElement emailLoginInput = driver.findElement(By.id("id=\"email\""));
	        WebElement passwordLoginInput = driver.findElement(By.id("id=\"pass\""));
	        WebElement loginSubmitButton = driver.findElement(By.id("id=\"loginbutton\""));

	        emailLoginInput.sendKeys("Udaykiran.1129@gmail.com");
	        passwordLoginInput.sendKeys("passwrd1");
	        loginSubmitButton.click();
	        
	        try {
	            Thread.sleep(2000); 
	        }
catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	       
	        System.out.println(driver.getPageSource());

	        
	        driver.quit();
	    }
	

}
	
