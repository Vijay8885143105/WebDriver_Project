package webdriver_project_practice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Broken_Links {
    public static void main(String[] args) {
        // Set the path for the WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the target URL
            driver.get("https://example.com");

            // Get all anchor tags (<a>) on the page
            List<WebElement> links = driver.findElements(By.tagName("a"));

            System.out.println("Total links found: " + links.size());

            // Check each link
            for (WebElement link : links) {
                String url = link.getAttribute("href");

                if (url == null || url.isEmpty()) {
                    System.out.println("URL is either not configured for anchor tag or it is empty");
                    continue;
                }

                // Verify if the link is valid
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();
                    int responseCode = connection.getResponseCode();

                    if (responseCode >= 400) {
                        System.out.println("Broken link: " + url + " - Response Code: " + responseCode);
                    } else {
                        System.out.println("Valid link: " + url + " - Response Code: " + responseCode);
                    }
                } catch (IOException e) {
                    System.out.println("Exception while checking URL: " + url + " - " + e.getMessage());
                }
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}


