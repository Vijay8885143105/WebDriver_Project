package july3;

import java.security.MessageDigest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Validate_loginfunctionality {

	private static final String Expected = null;

	public static void main(String[] args) throws Throwable {
		// create instant object
		//system.setproperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//lauch url
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//Store user name into webelement object
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		String Enterusername = username.getAttribute("value");
		//Store password into web element
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String Enterpassword = password.getAttribute("value");
		System.out.println(Enterusername+"      "+Enterpassword);
		//click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		Thread.sleep(5000);
		String Exepected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if (Actual.endsWith(Exepected)) 
		{
			System.out.println("Login success::::"+Expected+"      "+Actual);
		}
		else {
			//Capture error message
			String error_message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+"      "+Expected+"     "+Actual);
		}
		driver.quit();
	}







}


