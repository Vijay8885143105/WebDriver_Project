package webdriver_project_practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://chatgpt.com/");
		Thread.sleep(3000);
		List<WebElement>HyperLinks=dr.findElements(By.tagName("a"));
		System.out.println("Number of hyper links are::::::::::"+HyperLinks.size());
		for (WebElement each : HyperLinks) {
			System.out.println(each.getText());
			
		}
		

	}

}
