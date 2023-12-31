package july8_task_irctc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collctn_CheckBoxes_Names_IRCTC {

	public static void main(String[] args) throws Throwable {
		// create instant object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		//Get collection of checkBoxes
		List<WebElement> all_checkboxes = driver.findElements(By.xpath("//*[@class='css-label_c t_c']"));
		System.out.println("Number of check boxes are::::"+all_checkboxes.size());
		Thread.sleep(5000);
		//Check Boxes Names
		for (WebElement each : all_checkboxes) {
			System.out.println(each.getText());
		}
		driver.close();
		

	}

}
