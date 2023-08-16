package july18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Table_Data {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		//get rows collection
		rows=webtable.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println("Number of rows are::"+row);
		Thread.sleep(5000);
		for (WebElement eachrow : rows) {
			cols=eachrow.findElements(By.tagName("td"));
			//iterate all cells
			for (WebElement eachcell : cols) {
				Thread.sleep(2000);
				System.out.println("\n"+eachcell.getText());
				
				
			}
			System.out.println();
			System.out.println("===========================================");
			
		}
		Thread.sleep(5000);
		driver.quit();
			
		}
			
		

	}


