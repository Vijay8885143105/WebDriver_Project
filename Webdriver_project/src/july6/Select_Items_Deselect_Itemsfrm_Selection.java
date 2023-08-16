package july6;

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
		for(int i=0;i<=7;i++);
		{
			Thread.sleep(5000);
			multiListbox.selectByIndex(0);
			Thread.sleep(5000);
			multiListbox.selectByIndex(1);
			Thread.sleep(1000);
			multiListbox.selectByIndex(2);
			Thread.sleep(1000);
			multiListbox.selectByIndex(3);
			Thread.sleep(1000);
			multiListbox.selectByIndex(4);
			Thread.sleep(1000);
			multiListbox.deselectByIndex(5);
			Thread.sleep(1000);
			multiListbox.selectByIndex(6);
			Thread.sleep(1000);
			multiListbox.deselectByIndex(0);
			Thread.sleep(5000);
			multiListbox.deselectByIndex(3);
			Thread.sleep(5000);
			multiListbox.deselectAll();
			Thread.sleep(5000);
			driver.quit();
		
		}
		
		
		

	}

}
