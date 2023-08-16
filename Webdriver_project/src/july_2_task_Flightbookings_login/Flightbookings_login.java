package july_2_task_Flightbookings_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightbookings_login {

	public static void main(String[] args) throws Throwable {
		// create instant object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("sherividyasagar75@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9704640016");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		driver.quit();



	}

}
