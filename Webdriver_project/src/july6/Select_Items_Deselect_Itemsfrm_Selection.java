package july6;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Items_Deselect_Itemsfrm_Selection {

	public static void main(String[] args) throws Throwable {
		//create instance object
		//system.setproperty("webdriver.chrome.driver","D:/chromedriver")
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch Url
		driver.get("file:///D:/MultiListboxHtmlpage_lyst3181.html");
		Thread.sleep(5000);
		Select multiListbox = new Select(driver.findElement(By.name("multiSelection")));
		//verify List box is single or multiselection
		boolean value = multiListbox.isMultiple();
		System.out.println(value);
		//select 0 to 7 item
		int a[] = {1,0,3,6,8};
		
		
		for(int i=0;i<a.length;i++)
		{
			Thread.sleep(500);
			multiListbox.selectByIndex(a[i]);

		}

		for(int i=0;i<a.length;i++)
		{
			Thread.sleep(500);
			multiListbox.deselectByIndex(a[i]);

		}

		for(int i=0;i<a.length;i++)
		{
			Thread.sleep(500);
			multiListbox.selectByIndex(a[i]);

		}

		multiListbox.deselectAll();


		driver.quit();




	}

}
