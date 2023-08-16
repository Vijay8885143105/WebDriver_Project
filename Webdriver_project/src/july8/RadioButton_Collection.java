package july8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Collection {

	public static void main(String[] args) throws Throwable {
		// create instant object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("sherividyasagar75@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9704640016");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		//get collection of radio buttons
		List<WebElement>all_Radios = driver.findElements(By.xpath("//div[@class='radio_b']"));
		System.out.println("Number of radio buttons are:::"+all_Radios.size());
		for (WebElement each : all_Radios) {
			System.out.println(each.getText());
		}
			driver.quit();
			
		}
		
		
		
		

	}


