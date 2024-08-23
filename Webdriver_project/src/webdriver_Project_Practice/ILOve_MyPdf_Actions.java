package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ILOve_MyPdf_Actions {

	public static void main(String[] args) throws Throwable {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.ilovepdf.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//div[@class='footer-big__lang']//span[@class='lang__current'][normalize-space()='English']"))).click().perform();
		Thread.sleep(4000);
		ac.moveToElement(dr.findElement(By.xpath("//div[@class='footer-main']//li[6]"))).click().perform();
		Thread.sleep(4000);
		ac.moveToElement(dr.findElement(By.xpath("//div[@class='footer-big__lang']//span[@class='lang__current'][normalize-space()='Português']"))).click().perform();
		Thread.sleep(4000);
		ac.moveToElement(dr.findElement(By.xpath("//div[@class='footer-big__lang']//a[normalize-space()='English']"))).click().perform();
		Thread.sleep(3000);
		dr.close();
		
		
		
		

	}

}
