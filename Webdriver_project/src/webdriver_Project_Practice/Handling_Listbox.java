package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handling_Listbox {

	public static void main(String[] args) throws Throwable {
	    WebDriver dr = new ChromeDriver();
	    dr.manage().window().maximize();
	    dr.get("https://uidai.gov.in/en/ecosystem.html");
	    Thread.sleep(3000);
	    //store list box into slect
	    Select Listbox = new Select(dr.findElement(By.xpath("//select[@id='contact-select']")));
	    List<WebElement>all_items =Listbox.getOptions();
	    System.out.println(all_items.size());
	    for (WebElement each : all_items) {
			System.out.println(each.getText());
		    
		}
	    
	    
	   
	    

	}

}
