package july_2_task_Flightbookings_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_login {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"))).click().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("sherividyasagar75@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("8885143105");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
