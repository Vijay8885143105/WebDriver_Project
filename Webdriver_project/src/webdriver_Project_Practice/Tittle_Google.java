package webdriver_Project_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tittle_Google {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String expected="Google";
		String actual=driver.getTitle();
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("title is matching:::::::"+expected+"      "+actual);		
			}
		else
		{
			System.out.println("title is not matching::::::"+expected+"       "+actual);
			Thread.sleep(4000);
			driver.quit();
		}
		

	}

}
