package webdriver_Project_Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightbookin_Login {

	public static void main(String[] args) throws Throwable {
		WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://flights.qedgetech.com");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("sherividyasagar75@gmail.com");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("8885143105");
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		dr.findElement(By.xpath("//i[@class='fa fa-gear']")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		Thread.sleep(4000);
		dr.close();

		


		

	}

}
