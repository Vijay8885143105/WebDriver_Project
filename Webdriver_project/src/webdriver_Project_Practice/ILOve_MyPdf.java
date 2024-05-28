package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ILOve_MyPdf {

	public static void main(String[] args) throws Throwable {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.ilovepdf.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//a[@class='link--secondary hide--sm']"))).click().perform();
		

	}

}
