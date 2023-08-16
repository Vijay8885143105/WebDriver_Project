package july4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_cmnds_Googlepage {

	public static void main(String[] args) throws Throwable {
		// create instant object
		//system.setproperty("webdriver.chrome.driver","D:/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //launch url
        driver.navigate().to("https://www.google.com/");
        //suspend tool for 5 seconds
        Thread.sleep(5000);
        System.out.println("pagetitle[1]"+driver.getTitle());
        //Click Gmail link
        driver.findElement(By.linkText("Gmail")).click();
        System.out.println("pagetitle[2]"+driver.getTitle());
        Thread.sleep(5000);
        //click back button
        driver.navigate().back();
        System.out.println("pagetitlte[3]"+driver.getTitle());
        Thread.sleep(5000);
        //click forward button
        driver.navigate().forward();
        System.out.println("pagetitle[4]"+driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();
        
        
        
       

	}

}
