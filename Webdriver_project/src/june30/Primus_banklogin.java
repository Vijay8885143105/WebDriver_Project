package june30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primus_banklogin {

	public static void main(String[] args)throws Throwable {
		//create instant object
	    //System.setProperty("webdriver.chrome.driver","D:/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool for five seconds
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//suspend tool for  five seconds
		Thread.sleep(5000);
		driver.quit();


	}

}