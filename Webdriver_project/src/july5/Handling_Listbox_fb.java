package july5;

import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Listbox_fb {

	public static void main(String[] args) throws Throwable {

        //create instant object
		//System.setProperty("webdriver.chrome.driver","D:/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.navigate().to("https://www.facebook.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//Store day,month,year listbox into select
		Select daylist = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist = new Select(driver.findElement(By.name("birthday_month")));
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		//verify listbox is single or multiple 
        boolean value = monthlist.isMultiple();
        System.out.println(value);
        //select items in three list box using select methods
        daylist.selectByVisibleText("5");
        Thread.sleep(5000);
        monthlist.selectByIndex(5);
        Thread.sleep(5000);
        year.selectByVisibleText("1994");
        Thread.sleep(5000);
        driver.quit();
        
	}    
        
}  
        
        
       
        
      
     
  
    



	


