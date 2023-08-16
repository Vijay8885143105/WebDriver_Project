package july22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//create object for webdriverwait class
	WebDriverWait mywait = new WebDriverWait(driver, 20);
	//wait until link is clickable
	mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
	driver.findElement(By.linkText("Create new account")).click();
	//wait until firstname textbox is visible to selenium
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	driver.findElement(By.name("firstname")).sendKeys("testing");
	

	}

}
