package july6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AletrtWindow {

	public static void main(String[] args) throws Throwable {
	     WebDriver dr= new ChromeDriver();
	     dr.manage().window().maximize();
	     dr.get("http://primusbank.qedgetech.com/");
	     Thread.sleep(5000);
	     dr.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
	     dr.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
	     dr.findElement(By.xpath("//input[@id='login']")).click();
	     

	}

}
