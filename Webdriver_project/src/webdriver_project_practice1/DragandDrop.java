package webdriver_project_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DragandDrop {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.fitpeo.com/revenue-calculator");
		Thread.sleep(2000);
		WebElement textbox=dr.findElement(By.id(":R57alklff9da:"));
		Thread.sleep(4000);
		textbox.clear();
		Thread.sleep(4000);
		textbox.sendKeys("500");
		

	}

}
