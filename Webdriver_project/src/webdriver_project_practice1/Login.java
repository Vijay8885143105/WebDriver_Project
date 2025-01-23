package webdriver_project_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws Throwable {
	//LOGIN TO SOME APPLICATION 
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://flights.qedgetech.com/");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("sherividyasagar75@gmail.com");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("8885143105");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		String Expected_URL="/vidyasagarsheri.html";
		String Actual_URL=dr.getCurrentUrl();
		if (Actual_URL.endsWith(Expected_URL)) {
			System.out.println("Login succeessefully");
		}
		else
		{
			System.out.println("Login fail");
		}
		
		dr.close();
		

	}

}
