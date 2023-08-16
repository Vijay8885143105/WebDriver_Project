package july2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_registerr {

	public static void main(String[] args)throws Throwable {
		// creat instantce object
		System.setProperty("wedriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.partialLinkText("Regist")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("vidyasagar");
        driver.findElement(By.name("contact")).sendKeys("8885143105");
        driver.findElement(By.name("email")).sendKeys("sherividyasagar75@gmial.com");
        driver.findElement(By.name("password")).sendKeys("flight@24");
        driver.findElement(By.name("gender")).sendKeys("male");
        driver.findElement(By.name("dob")).sendKeys("11-08-1995");
        driver.findElement(By.id("flexCheckChecked")).click();
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        driver.quit();
    
        
	}

}
