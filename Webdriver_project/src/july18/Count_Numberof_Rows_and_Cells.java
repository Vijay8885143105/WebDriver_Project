package july18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Numberof_Rows_and_Cells {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		//get collection of rows in table
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("Number of rows are::"+row);
		//get collection in each row
		for (int i = 0; i < rows.size(); i++) {
			cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No."+i+"       "+"column size::"+cols.size());

		}
		driver.quit();


	}

}
