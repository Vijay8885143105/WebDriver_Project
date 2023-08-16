package july4;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection_hyprlnks_Htmltag_a {
	public static void main(String[] args) throws Throwable {
		// create instant object
		//system.setproperty("webdriver.chrome.driver","D:/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.navigate().to("http://primusbank.qedgetech.com/");
	    Thread.sleep(5000);
	    //Get collection of hyperlinks in a page which are stored into html tag a
	    List<WebElement>all_Links = driver.findElements(By.tagName("a"));
	    System.out.println("Number of links are::"+all_Links.size());
	    for(WebElement each:all_Links) {
	    	System.out.println(each.getText());
	    }
	    driver.quit();
			
		}
		
	}
			
		
	   
		
	

	


