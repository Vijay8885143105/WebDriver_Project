package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_AlertMessage1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(5000);
		String Alert_Message=dr.switchTo().alert().getText();
		System.out.println(Alert_Message);
		dr.switchTo().alert().accept();
		
		
		

	}

}
