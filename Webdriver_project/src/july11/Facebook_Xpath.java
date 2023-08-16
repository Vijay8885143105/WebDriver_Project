package july11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Xpath {

	public static void main(String[] args) throws Throwable {
		// create instant object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@id,'u')])[1]")).sendKeys("Testing");
		driver.findElement(By.xpath("(//input[contains(@id,'u')])[2]")).sendKeys("selenium");
		driver.findElement(By.xpath("(//input[contains(@id,'u')])[3]")).sendKeys("Testing@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@id,'u')])[4]")).sendKeys("Testing@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@id,'u')])[5]")).sendKeys("selenium2343");
		new Select(driver.findElement(By.xpath("//select[contains(@id,'da')]"))).selectByIndex(3);
		new Select(driver.findElement(By.xpath("(//select[contains(@name,'bir')])[2]"))).selectByIndex(3);
		new Select(driver.findElement(By.xpath("(//select[contains(@name,'bir')])[3]"))).selectByVisibleText("1995");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("(//button[contains(@id,'u_3')])[1]")).click();
		
		
		
		

	}

}
