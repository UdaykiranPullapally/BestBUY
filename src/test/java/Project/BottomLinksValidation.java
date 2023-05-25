package Project;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	// import org.openqa.selenium.chrome.ChromeDriver;

	public class BottomLinksValidation {
	    public static void main(String[] args) {
	        // Instantiate the web driver (choose the appropriate driver for your browser)
	        WebDriver driver = new FirefoxDriver();  // For Firefox
	        // WebDriver driver = new ChromeDriver();  // For Chrome

	        // Open the homepage
	        driver.get("https://example.com");  // Replace with your homepage URL

	        // Get all the bottom links
	        WebElement bottomLinksContainer = driver.findElement(By.id("bottom-links"));  // Replace with the appropriate element identifier for your homepage
	        java.util.List<WebElement> bottomLinks = bottomLinksContainer.findElements(By.tagName("a"));

	        // Validate each bottom link
	        for (WebElement link : bottomLinks) {
	            String url = link.getAttribute("href");
	            String text = link.getText();

	            // Perform your validation here
	            // For example, you can check if the link is not empty and if it opens successfully
	            if (!url.isEmpty()) {
	                link.click();  // Click the link to navigate to the page
	                if (driver.getCurrentUrl().equals(url)) {
	                    System.out.println("Link '" + text + "' with URL '" + url + "' is valid.");
	                } else {
	                    System.out.println("Link '" + text + "' with URL '" + url + "' is invalid.");
	                }
	                driver.navigate().back();  // Return to the homepage
	            } else {
	                System.out.println("Link with text '" + text + "' has no URL defined.");
	            }
	        }

	        // Close the web browser
	        driver.quit();
	    }
	}

}
