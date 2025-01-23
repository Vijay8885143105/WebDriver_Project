package webdriver_project_practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigation_Commands {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.google.co.in/");
		Thread.sleep(4000);
	    String Tittle=dr.getTitle();
	    System.out.println("Tittle First Time Print::::::::"+Tittle);
	    System.out.println(Tittle.length());
	    Actions ac = new Actions(dr);
	    ac.moveToElement(dr.findElement(By.xpath("//textarea[@id='APjFqb']"))).sendKeys("BookMyshow");
	    ac.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(4000);
	    ac.moveToElement(dr.findElement(By.xpath("//h3[contains(text(),'BookMyShow: Movie Tickets, Plays, Sports, Events &')]"))).click().perform();
	    Thread.sleep(4000);
	    dr.navigate().back();
	    Thread.sleep(3000);
	    dr.navigate().back();
	    Thread.sleep(3000);
	    String Tittle2=dr.getTitle();
	    System.out.println("Tittle Second Time Print::::::::"+Tittle2);
	    System.out.println(Tittle2.length());
	    dr.navigate().forward();
	    List<WebElement>All_HyperLinks=dr.findElements(By.tagName("a"));
	    System.out.println("Number of hyperlinks in book my show:::::::"+All_HyperLinks.size());
	    dr.navigate().refresh();
	    dr.quit();
	    
	    
	    
		
		

	}

}
