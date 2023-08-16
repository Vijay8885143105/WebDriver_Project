package july17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interact_webelement_withJava {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//div[@class='nav float-end']//div[@class='dropdown']//span[@class='d-none d-md-inline']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		js.executeScript("document.querySelector(\"#input-firstname\").value='selenium'");
		js.executeScript("document.querySelector(\"#input-lastname\").value='testing'");
		js.executeScript("document.querySelector(\"#input-email\").value='test@gmail.com'");
		js.executeScript("document.querySelector(\"#input-password\").value='test@345'");
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		driver.quit();
		

	}

}
