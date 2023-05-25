package Project;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidation {
    public static void main(String[] args) {
        // Instantiate the web driver (choose the appropriate driver for your browser)
        
        WebDriver driver = new ChromeDriver();  
        // Open the web page containing the link
        driver.get("https://example.com");  // Replace with the URL of the web page

        // Find the link element
        WebElement linkElement = driver.findElement(By.linkText("Link Text"));  // Replace with the actual link text or appropriate locator

        // Get the link URL
        String linkURL = linkElement.getAttribute("href");

        // Validate the link URL
        boolean isLinkValid = isURLValid(linkURL);

        if (isLinkValid) {
            System.out.println("The link is valid.");
        } else {
            System.out.println("The link is broken.");
        }

        // Close the web browser
        driver.quit();
    }

    public static boolean isURLValid(String url) {
        try {
            // Create a URL object
            URL link = new URL(url);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) link.openConnection();
            connection.setRequestMethod("HEAD");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Close the connection
            connection.disconnect();

            // Check if the response code is within the success range
            return responseCode >= 200 && responseCode < 400;
        } catch (IOException e) {
            // Exception occurred, so the link is considered broken
            return false;
        }
    }
}

