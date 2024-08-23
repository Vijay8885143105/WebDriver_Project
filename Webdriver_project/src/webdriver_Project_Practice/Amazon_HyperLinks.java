package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_ListBox {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.amazon.com/");
		Thread.sleep(4000);
		Select ListBox=new Select(dr.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		Thread.sleep(4000);
        List<WebElement> Number=ListBox.getOptions();
        System.out.println(Number.size());
        for (WebElement each : Number) {
        	System.out.println(each.getText());
			
		}
	}

}
