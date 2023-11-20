package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DeselectItems_Listbox {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///D:/MultiListboxHtmlpage_lyst3181.html");
		Thread.sleep(4000);
		Select multilist_box = new Select(dr.findElement(By.xpath("//select[@name='multiSelection']")));
		boolean value =multilist_box.isMultiple();
		System.out.println(value);
		//select and deselect items in listbox
		for (int i = 0; i <=7; i++) {
			multilist_box.selectByIndex(0);
			Thread.sleep(3000);
			multilist_box.selectByIndex(1);
			Thread.sleep(3000);
			multilist_box.selectByIndex(2);
			Thread.sleep(3000);
			multilist_box.selectByIndex(3);
			Thread.sleep(3000);
			multilist_box.selectByIndex(4);
			Thread.sleep(3000);
			multilist_box.selectByIndex(5);
			Thread.sleep(3000);
			multilist_box.selectByIndex(6);
			Thread.sleep(3000);
			multilist_box.deselectByIndex(2);
			Thread.sleep(3000);
			multilist_box.deselectByIndex(4);
			Thread.sleep(3000);
			multilist_box.deselectByIndex(6);
			Thread.sleep(3000);
			multilist_box.deselectAll();
			List<WebElement>all_items = multilist_box.getOptions();
			System.out.println(all_items.size());
			for (WebElement each : all_items) {
				System.out.println(each.getText());
				dr.quit();
				
			}




             

		}
		

	}

}
