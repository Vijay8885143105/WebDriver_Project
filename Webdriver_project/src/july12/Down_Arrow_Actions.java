package july12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Down_Arrow_Actions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("selenium openings");
		Thread.sleep(4000);
		//Press arrow down for 3 times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ENTER).perform();
		driver.close();
		
				

	}

}
