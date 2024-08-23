package july12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Keyboard_Actions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		//click create account
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]")).click();
		Thread.sleep(5000);
		//press up Arrow for three times
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ENTER).build().perform();
		driver.close();
		
		
		

	}

}
