package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_LoginFunctionality {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(3000);
		//store webElement for Username
		WebElement username =dr.findElement(By.name("txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		String Enterusername =username.getAttribute("value");
		System.out.println(Enterusername);
		//store webElement for password
		WebElement password = dr.findElement(By.name("txtPassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String Enterpassword=password.getAttribute("value");
		System.out.println(Enterpassword);
		//click on login button
		dr.findElement(By.name("Submit")).click();
		String Expected = "dashboard";
		String Actual = dr.getCurrentUrl();
		if (Actual.endsWith(Expected)) {
			System.out.println("Login success::::::"+Expected+"       "+Actual);
		}
		else
		{
			System.out.println("Login fail:::::::"+Expected+"         "+Actual);
		}
		dr.close();
	}

}
