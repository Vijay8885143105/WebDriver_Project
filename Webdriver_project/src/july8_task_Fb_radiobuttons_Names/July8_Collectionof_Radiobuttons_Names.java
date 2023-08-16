package july8_task_Fb_radiobuttons_Names;

import java.awt.event.FocusAdapter;
import java.net.PortUnreachableException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July8_Collectionof_Radiobuttons_Names {

	public static void main(String[] args) throws Throwable {
		// create instant object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//get collection of Radio buttons
		List<WebElement>all_Radios = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Number of radio buttons are:::"+all_Radios.size());
		//get collection of radio button names
		for  (WebElement each : all_Radios) {
			System.out.println(each.getText());
		}
			driver.quit();
		}




	}


