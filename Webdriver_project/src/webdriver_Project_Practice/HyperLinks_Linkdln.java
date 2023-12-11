package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks_Linkdln {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://in.indeed.com/?r=us");
		Thread.sleep(5000);
		List<WebElement> All_Links = dr.findElements(By.tagName("a"));
		Thread.sleep(5000);
		System.out.println(All_Links.size());
		for (WebElement each : All_Links) {
			System.out.println(each.getText());
		}

	}

}
