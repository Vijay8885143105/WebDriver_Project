package webdriver_Project_Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookAll_Perfomances {

	public static void main(String[] args) throws Throwable {
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.manage().deleteAllCookies();
	  dr.get("https://www.facebook.com/");
	  Thread.sleep(5000);
	  dr.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(2000);
	  dr.findElement(By.name("firstname")).sendKeys("Vijay");
	  Thread.sleep(2000);
	  dr.findElement(By.name("lastname")).sendKeys("sheri");
	  dr.findElement(By.name("reg_email__")).sendKeys("7382987824");
	  dr.findElement(By.name("reg_passwd__")).sendKeys("7382987824");
	  Thread.sleep(2000);
	  Select Listbox= new Select(dr.findElement(By.xpath("//select[@id='day']")));
	  Listbox.selectByIndex(10);
	  Thread.sleep(2000);
	  Select Listbox1= new Select(dr.findElement(By.xpath("//select[@id='month']")));
	  Listbox1.selectByValue("8");
	  Thread.sleep(2000);
	  Select Listbox2= new Select(dr.findElement(By.xpath("//select[@id='year']")));
	  Listbox2.selectByVisibleText("1995");
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//input[@value='2']")).click();
	  WebElement privacy_Policy=dr.findElement(By.id("privacy-link"));
	  String catch_Text= privacy_Policy.getText();
	  System.out.println(catch_Text);
	  dr.quit();
	 
	  
	  

	  

	  



	}

}
