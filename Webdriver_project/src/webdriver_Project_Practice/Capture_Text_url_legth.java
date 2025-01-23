package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Text_url_legth {

	public static void main(String[] args) throws Throwable {
	   WebDriver dr=new ChromeDriver();
	   dr.manage().window().maximize();
	   dr.manage().deleteAllCookies();
	   dr.get("https://josaa.nic.in/");
	   Thread.sleep(3000);
	   String str=dr.findElement(By.xpath("//a[normalize-space()='Activity Board']")).getText();
	   Thread.sleep(4000);
	   System.out.println(str);
	   String str1=dr.getCurrentUrl();
	   System.out.println(str1);
	   System.out.println(str1.length());   
	   dr.close();

	   
	   

	}

}
