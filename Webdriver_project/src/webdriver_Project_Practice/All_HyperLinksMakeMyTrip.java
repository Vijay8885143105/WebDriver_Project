package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_HyperLinksMakeMyTrip {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		List< WebElement> All_HyperLinks =dr.findElements(By.tagName("a"));
		System.out.println(All_HyperLinks.size());
		dr.close();
	
	}

}
