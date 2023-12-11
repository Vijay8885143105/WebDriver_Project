package july8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
		WebElement signup_button =dr.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']"));
		Thread.sleep(5000);
		boolean value=signup_button.isEnabled();
		System.out.println(value);
//		Actions ac = new Actions(dr);
//		ac.moveToElement(dr.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']"))).click().perform();
//		Thread.sleep(5000);
//	    String getit_OnGogglePlay = dr.findElement(By.xpath("//img[@alt='Get it on Google Play']")).getText();
//	    System.out.println(getit_OnGogglePlay);





	}

}
