package july8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) throws Throwable {
		// create instant object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//verify first name text is enabled or disabled
		WebElement firstname = driver.findElement(By.name("firstname"));
		boolean isEnabled_textbox = firstname.isEnabled();
		System.out.println(isEnabled_textbox);
		//verify reenter text box is displayed or hidden
		WebElement reenterEmail = driver.findElement(By.name("reg_email_confirmation__"));
		boolean isDisplayed_Mailtextbox = reenterEmail.isDisplayed();
		System.out.println(isDisplayed_Mailtextbox);
		//verify Radio button is selected or not
		WebElement femaleradio = driver.findElement(By.xpath("//input[@value='1']"));
		boolean isSelected_Radio = femaleradio.isSelected();
		System.out.println(isSelected_Radio);
		driver.close();
		
		
		
		
		

	}

}
