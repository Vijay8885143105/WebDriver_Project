package july3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTxt_Google {

	public static void main(String[] args) throws Throwable {
		// create instant object
		//system.setproperty("webdriver.chrome.driver","D:/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.google.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		//capture gmail link text in google page
		String elementtext = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(elementtext);
		//capture gmail link url
		String elementurl = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(elementurl);
		driver.quit();
		
				

	}

}
