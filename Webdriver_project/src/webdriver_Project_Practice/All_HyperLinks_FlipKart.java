package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class All_HyperLinks_FlipKart {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://flipkart.com");
		Thread.sleep(3000);
		Actions ac = new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/div[1]"))).click().perform();
		//collection of hyperlinks in page
		List<WebElement>all_Links = dr.findElements(By.tagName("a"));
		System.out.println("Number of Links are:::::::::"+all_Links.size());
		for (WebElement each : all_Links) {
			System.out.println(each.getText());
		}

	}

}
