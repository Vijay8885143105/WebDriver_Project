package webdriver_project_practice1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSpcfcWndw {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.google.com/intl/en/gmail/about/");
		Thread.sleep(3000);
		String parent=dr.getWindowHandle();
		System.out.println(parent);
		dr.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);
		//Click on three links
		dr.findElement(By.xpath("//a[normalize-space()='Help']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[normalize-space()='Privacy']")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[normalize-space()='Terms']")).click();
		Thread.sleep(2000);
		//store all window id into array collection
		ArrayList<String>Windows=new ArrayList<String>(dr.getWindowHandles());
		Thread.sleep(3000);
		dr.switchTo().window(Windows.get(0));
		Thread.sleep(3000);
		dr.switchTo().window(Windows.get(1));
		Thread.sleep(3000);
		dr.switchTo().window(Windows.get(2));
		Thread.sleep(3000);
		dr.switchTo().window(Windows.get(3));
		Thread.sleep(3000);
		Actions ac=new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//a[@class='appbar-helpcenter-sections__link appbar-helpcenter-sections--community']"))).click().perform();
		String str=dr.findElement(By.xpath("//span[@itemprop='title']")).getText();
		System.out.println(str);
		



		





	}

}
