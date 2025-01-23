package webdriver_project_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) throws Throwable {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(4000);
		dr.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(4000);
		String Text=dr.switchTo().alert().getText();
		System.out.println(Text);
		dr.switchTo().alert().accept();
		dr.close();
		
		
		

	}

}
