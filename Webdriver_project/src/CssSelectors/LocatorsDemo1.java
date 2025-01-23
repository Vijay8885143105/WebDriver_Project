package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		/*dr.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//Tag & ID
		dr.findElement(By.cssSelector("input#email")).sendKeys("Vijay");
		dr.findElement(By.cssSelector("#email")).sendKeys("Vijay");  //tag name is optional
		dr.close();*/
		
		dr.get("https://flights.qedgetech.com/");
		Thread.sleep(4000);	
		//Tag & Class
		//dr.findElement(By.cssSelector("input.form-control")).sendKeys("Vasavi");
		//dr.findElement(By.cssSelector(".form-control")).sendKeys("Vasavi");
		
		//Tag & Attribute
		//dr.findElement(By.cssSelector("input[type=email]")).sendKeys("Lavanya");
		//dr.findElement(By.cssSelector("[type=email]")).sendKeys("Lavanya");
		
		//Tag Class & attribute
		dr.findElement(By.cssSelector("input.form-control[name=email]")).sendKeys("Devatha");
		dr.findElement(By.cssSelector("input.form-control[name=password]")).sendKeys("1234567890");
		dr.close();



		


		

		
		
	}

}
