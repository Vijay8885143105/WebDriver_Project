package july6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Capture_AlrtTxt_Clck_OK_Butn {

	public static void main(String[] args) throws Throwable {
		// create instant object
		//system.setproperty("webdriver.chrome.driver","D:/chromedriver")
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click login without enter login details
		driver.findElement(By.name("proceed")).click();
		//Capture Alert message
		String alert_message = driver.switchTo().alert().getText();
		System.out.println(alert_message);
		Thread.sleep(5000);
		//click ok button to alert window
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	
				

	}

}
