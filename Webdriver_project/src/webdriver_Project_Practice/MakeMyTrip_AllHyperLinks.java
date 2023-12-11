package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_AllHyperLinks {

	public static void main(String[] args) throws Throwable {
      WebDriver dr=new ChromeDriver();
      dr.manage().window().maximize();
      dr.manage().deleteAllCookies();
      dr.get("https://www.makemytrip.com/");
      Thread.sleep(4000);
      List<WebElement>HyperLinks=dr.findElements(By.tagName("a"));
      System.out.println("Number of Links are:::::"+HyperLinks.size());
      for (WebElement each : HyperLinks) {
		System.out.println(each.getText());

	}
      
	}

}
