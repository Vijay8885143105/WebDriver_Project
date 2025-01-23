package webdriver_project_practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectItems_ListBox {

	public static void main(String[] args) throws Throwable {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("file:///D:/MultiListboxHtmlpage_lyst3181.html");
		Thread.sleep(4000);
		Select MultiListBox=new Select(dr.findElement(By.xpath("//select[@name='multiSelection']")));
		Thread.sleep(4000);
		Boolean single0Rmultiple=MultiListBox.isMultiple();
		System.out.println(single0Rmultiple);
		for (int i = 0; i <=11; i++) {
			MultiListBox.selectByIndex(0);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(2);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(4);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(6);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(8);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(10);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(1);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(3);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(5);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(7);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(9);
			Thread.sleep(2000);
			MultiListBox.selectByIndex(11);
			Thread.sleep(2000);
			MultiListBox.deselectByIndex(0);
			Thread.sleep(2000);
			MultiListBox.deselectByIndex(2);
			Thread.sleep(2000);
			MultiListBox.deselectByIndex(4);
			Thread.sleep(2000);
			MultiListBox.deselectByIndex(6);
			Thread.sleep(2000);
			MultiListBox.deselectByIndex(8);
			Thread.sleep(2000);
			MultiListBox.deselectByIndex(10);
			Thread.sleep(2000);
			MultiListBox.deselectAll();
			List<WebElement>All_Items=MultiListBox.getOptions();
			System.out.println(All_Items.size());
			for (WebElement each : All_Items) {
				System.out.println(each.getText());
				dr.quit();

			}












		}



	}

}
