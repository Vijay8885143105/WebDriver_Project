package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusBankLoginValidation {

	public static void main(String[] args) throws Throwable {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		WebElement username =dr.findElement(By.xpath("//input[@id='txtuId']"));
		username.clear();
		username.sendKeys("Admin");
		String Enterusername =username.getAttribute("value");
		WebElement password =dr.findElement(By.xpath("//input[@id='txtPword']"));
		password.clear();
		password.sendKeys("Admin");
		String Enterpassword =password.getAttribute("value");
		dr.findElement(By.xpath("//input[@id='login']")).click();
		//String alert_Message=dr.switchTo().alert().getText();
		//System.out.println(alert_Message);
		//Thread.sleep(5000);
		String Expected ="adminflow.aspx";
		String Actual =dr.getCurrentUrl();
		if (Actual.endsWith(Expected)) {
			System.out.println("Login successefull::::::::"+Expected+"         "+Actual);
		}		else
		{
			System.out.println("Login fail::::::::::"+Expected+"               "+Actual);
		}
		dr.quit();

		
		

	}

}
