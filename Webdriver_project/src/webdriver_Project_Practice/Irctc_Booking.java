package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Irctc_Booking {

	public static void main(String[] args) throws Throwable {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//p-autocomplete[@id='origin']//input[@role='searchbox']")).sendKeys("HYDERABAD DECAN - HYB (SECUNDERABAD)");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("GOHAD ROAD - GOA ");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//label[@for='dateSpecific']")).click();
		Thread.sleep(2000);
		List<WebElement> CheckBoxes =dr.findElements(By.xpath("//label[@class='css-label_c t_c']"));
		System.out.println(CheckBoxes.size());
		for (WebElement each : CheckBoxes) {
			System.out.println(each.getText());
//			Thread.sleep(3000);
//			Actions ac =new Actions(dr);
//			ac.moveToElement(dr.findElement(By.xpath("//button[@type='submit']")));
//			ac.sendKeys(Keys.ENTER).click().perform();
//			dr.quit();
			
		}



	}

}
