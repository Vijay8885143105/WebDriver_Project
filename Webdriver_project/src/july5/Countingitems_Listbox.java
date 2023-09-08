package july5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countingitems_Listbox {

	public static void main(String[] args) throws Throwable {
		//create instant object
		//System.setProperty("webdriver.chrome.driver","D:/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items
		List<WebElement> All_Items = listbox.getOptions();
		System.out.println("Number of items are::"+All_Items.size());
		for (WebElement each : All_Items) {
			Thread.sleep(5000);
			System.out.println(each.getText());
			
		}
	       Thread.sleep(5000);
	       driver.quit();
		
		 
		

	}

}
