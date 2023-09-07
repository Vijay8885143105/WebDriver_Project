package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALLHyperlnks_inpage {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://naukri.com");
		Thread.sleep(3000);
		//print collection hyperlinks in page
		List<WebElement>all_links =dr.findElements(By.tagName("a"));
		System.out.println("Number of Links are:::::"+all_links.size());
		for (WebElement each : all_links) {
			System.out.println(each.getText());
		
		}
		

	}

}
