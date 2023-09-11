package webdriver_Project_Practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Specific_WindowHandle {

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
		//store all window ids into array collection
		ArrayList<String> brw = new ArrayList<String>(dr.getWindowHandles());
		dr.switchTo().window(brw.get(1));
		Thread.sleep(4000);
		Actions ac = new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//div[@aria-label='Main menu']"))).click().perform();
		Thread.sleep(3000);
        ac.moveToElement(dr.findElement(By.xpath("//ul[@role='navigation']//ul//li//a[normalize-space()='Updates']"))).click().perform();
        Thread.sleep(3000);
        dr.close();
        dr.switchTo().window(brw.get(0));
        Thread.sleep(5000);
        dr.close();
        dr.switchTo().window(brw.get(2));
        dr.quit();





        
        

	}

}
