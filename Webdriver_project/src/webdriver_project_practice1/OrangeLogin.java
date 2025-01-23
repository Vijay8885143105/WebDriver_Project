package webdriver_project_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLogin {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/validateCredentials");
		Thread.sleep(4000);
		dr.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(4000);
		dr.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		Thread.sleep(4000);
		dr.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String expected="symfony/web/index.php/dashboard";
		String Actual =dr.getCurrentUrl();
		if (Actual.endsWith(expected)) {
			System.out.println("Login successefully");
		}
		else
		{
			System.out.println("Login Fail");
		}
		dr.close();


		
		

	}

}
