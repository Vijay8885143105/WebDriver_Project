package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Gmailtext_Url {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://google.com");
		Thread.sleep(3000);
		String str=dr.findElement(By.xpath("//a[@class='gb_B']")).getText();
		System.out.println(str);
		Thread.sleep(3000);
		String str1=dr.findElement(By.xpath("//a[@class='gb_B']")).getAttribute("href");
		System.out.println(str1);
		Thread.sleep(3000);

		

	}

}
