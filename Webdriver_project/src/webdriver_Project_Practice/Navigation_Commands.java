package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
		Thread.sleep(6000);
		System.out.println("pagetittle[1]::::"+dr.getTitle());
		//click on gmail link
		dr.findElement(By.xpath("//a[normalize-space()='Gmail']")).click();
		Thread.sleep(6000);
		dr.navigate().back();
		System.out.println("page tittle[2]::::::"+dr.getTitle());
		dr.findElement(By.xpath("//a[normalize-space()='Images']")).click();
		dr.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("First Time Enter Google With Selenium");
		Actions ac = new Actions(dr);
		ac.sendKeys(Keys.ENTER).perform();
		dr.navigate().refresh();
		dr.navigate().back();
		System.out.println("page tittle[3]::::"+dr.getTitle());
		dr.navigate().forward();
		dr.quit();
	

	}

}
