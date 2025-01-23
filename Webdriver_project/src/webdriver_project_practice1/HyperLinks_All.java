package webdriver_project_practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks_All {

	public static void main(String[] args) throws Throwable {
		//All Hyper Links
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.nestexam.in/");
		Thread.sleep(3000);
		List<WebElement>all_Hyperlinks=dr.findElements(By.tagName("a"));
		System.out.println(all_Hyperlinks.size());

		for (WebElement each : all_Hyperlinks) {
			System.out.println(each.getText());
		}

	}

}
