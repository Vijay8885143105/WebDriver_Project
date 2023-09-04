package july17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Exact_Location {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//Switch to Frame
		driver.switchTo().frame(0);	
		  WebElement source = driver.findElement(By.id("draggable"));
		  WebElement target= driver.findElement(By.id("droppable"));      
		  int x = target.getLocation().getX(); 
		  int y = target.getLocation().getY();
		  ac.dragAndDropBy(source, x,y).perform(); 
		  driver.close();
		 
	}

}
