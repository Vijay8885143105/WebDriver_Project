package july12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flipkart.com");
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		ac.moveToElement(driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"))).click().perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//a[@title='Puzzles']"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
		
		
	

	}

}
