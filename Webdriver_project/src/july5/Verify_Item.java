package july5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.Select;

public class Verify_Item {

	private static final WebElement[] All_Items = null;

	public static void main(String[] args) throws Throwable {  
    String Expected_Item = "baby";
    boolean Item_Exist = false;
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//launch url
	driver.get("https://amazon.in");
	Thread.sleep(5000);
	Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
	//get collection of items
	List<WebElement>all_ItemsElements = listbox.getOptions();
	System.out.println(all_ItemsElements.size());
	Thread.sleep(1000);
    for (WebElement each:All_Items) {
		String Actual_Items = each.getText();
		Thread.sleep(1000);
		System.out.println(Actual_Items);
		if(Actual_Items.equalsIgnoreCase(Expected_Item))
		{
			Item_Exist=true;
			break;
		}
	}
	if(Item_Exist)
	{
		System.out.println(Expected_Item+"      "+"Item Found in list box");
	}
	else
	{
		System.out.println(Expected_Item+"       "+"Item not found in list box");
	}
	Thread.sleep(5000);
	driver.close();

	
	}

}
