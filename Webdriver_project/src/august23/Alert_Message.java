 package august23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Message {

	public static void main(String[] args) throws Throwable {
		//create instant object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(4000);
		//Click Login button without eneter Login Details
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		//Capture alert message
		String Alert_message = driver.switchTo().alert().getText();
		System.out.println(Alert_message);
		Thread.sleep(4000);
		//Click ok button in alert window
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
