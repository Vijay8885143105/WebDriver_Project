package webdriver_project_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webTble_Script {
    public static void main(String[] args) {
        // Set the path for the WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the target webpage
            driver.get("https://example.com"); // Replace with your web table URL

            // Locate the table element
            WebElement table = driver.findElement(By.id("table-id")); // Replace "table-id" with the actual table ID or locator

            // Get all rows of the table
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            System.out.println("Number of rows in the table: " + rows.size());

            // Iterate through each row
            for (int i = 0; i < rows.size(); i++) {
                // Get all columns (cells) in the current row
                List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
                System.out.println("Row " + (i + 1) + " has " + columns.size() + " columns.");

                // Print data from each cell
                for (int j = 0; j < columns.size(); j++) {
                    String cellData = columns.get(j).getText();
                    System.out.println("Cell (" + (i + 1) + ", " + (j + 1) + "): " + cellData);
                }
            }

            // Example: Access a specific cell (e.g., second row, third column)
            WebElement specificCell = rows.get(1).findElements(By.tagName("td")).get(2); // Adjust index (0-based)
            System.out.println("Data in the second row, third column: " + specificCell.getText());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

