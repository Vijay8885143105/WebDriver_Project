package july23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmaillogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"))).click().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sherividyasagar75@gmail.com");
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"))).click().perform();
		driver.quit();
		
		

	}

}
