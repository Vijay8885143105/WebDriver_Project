package webdriver_Project_Practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Specific_Wndw_getText {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://gmail.com");
		Thread.sleep(5000);
		String parent =dr.getWindowHandle();
		System.out.println(parent);
		//click on three links
		dr.findElement(By.xpath("//a[normalize-space()='Help']")).click();
		dr.findElement(By.xpath("//a[normalize-space()='Privacy']")).click();
		dr.findElement(By.xpath("//a[normalize-space()='Terms']")).click();
		//store all windows id into array collection
		ArrayList<String> brw = new ArrayList<String>(dr.getWindowHandles());
		System.out.println(brw);
		dr.switchTo().window(brw.get(2));
		Thread.sleep(6000);
		Actions ac = new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//div[@aria-label='Main menu']//*[name()='svg']"))).click().perform();
		Thread.sleep(6000);
		ac.moveToElement(dr.findElement(By.xpath("//a[@class='MyGDhe'][normalize-space()='Updates']"))).click().perform();	
		Thread.sleep(6000);
		String catchtext =dr.findElement(By.xpath("//a[normalize-space()='Current version']")).getText();
		System.out.println(catchtext);
		dr.close();
		dr.switchTo().window(parent);
		Thread.sleep(6000);
		dr.quit();


	}

}
