package july8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Collection {

	public static void main(String[] args) throws Throwable {
		// create instant object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("file:///D:/checkbox_1_lyst5141.html");
		Thread.sleep(5000);
		//Get collection of checkboxes
		List<WebElement>all_checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of check boxes are:::"+all_checkboxes.size());
		Thread.sleep(5000);
		for (WebElement each : all_checkboxes) {
			//verify which check box is true or false
			boolean value = each.isSelected();
			//capture each check box name
			String checkbox_Name =each.getAttribute("value");
			System.out.println(checkbox_Name+"    "+value);
			each.click();
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
