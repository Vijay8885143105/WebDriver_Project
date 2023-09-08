package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

public class Listbox_items_Amazon1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://amazon.in");
		Thread.sleep(3000);
		Select Listbox = new Select(dr.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		//get collection of all items in the listbox
		List<WebElement>all_items = Listbox.getOptions();
		System.out.println(all_items.size());
		for (WebElement each: all_items) {
			System.out.println(each.getText());
		}

	}

}
