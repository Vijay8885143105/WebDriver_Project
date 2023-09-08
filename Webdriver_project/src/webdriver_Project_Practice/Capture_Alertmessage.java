package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Alertmessage {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(6000);
		String str =dr.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(3000);
		dr.switchTo().alert().accept();
		dr.quit();

	}

}
