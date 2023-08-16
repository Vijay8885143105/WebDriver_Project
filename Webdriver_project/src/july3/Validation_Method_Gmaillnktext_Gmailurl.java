package july3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Method_Gmaillnktext_Gmailurl {

	public static void main(String[] args) throws Throwable {
		// create instant object
		//System.setProperty("webdriver.chrome.driver", "D:/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //launch url
        driver.get("https://google.com/");
        Thread.sleep(5000);
        //capture gmail link text in google page
        String elementtext =driver.findElement(By.linkText("Gmail")).getText();
        System.out.println(elementtext);
        //capture gmail link url
       String elementUrl = driver.findElement(By.linkText("Gmail")).getAttribute("href");
       System.out.println(elementUrl);
       driver.quit();
        
       
				
		

	}

}
