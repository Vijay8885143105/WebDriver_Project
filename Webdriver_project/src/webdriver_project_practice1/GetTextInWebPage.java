package webdriver_project_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextInWebPage {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://josaa.nic.in/");
		Thread.sleep(4000);
		String webText=dr.findElement(By.xpath("//a[normalize-space()='English']")).getText();
		System.out.println("WebElement Text:::::::"+webText);
		System.out.println(webText.length());
		System.out.println(webText.charAt(6));





	}

}
