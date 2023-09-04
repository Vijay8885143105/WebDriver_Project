package august24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Message {

	public static void main(String[] args) throws Throwable {
		//Alert Message
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(4000);
		//Click Login Button without Enter Login Details
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(4000);
		String Alert_Message =driver.switchTo().alert().getText();
		Thread.sleep(4000);
		System.out.println("Alert_Message");
		driver.switchTo().alert().accept();
		driver.close();
		
		

	}

}
