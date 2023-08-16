package july13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rediff_Framescollection {

	public static void main(String[] args) throws Throwable {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://rediff.com/");
    Thread.sleep(5000);
    Actions ac = new Actions(driver);
    //get collection of frames
    List<WebElement>frames = driver.findElements(By.tagName("iframe"));
    System.out.println("Number of frames are:::"+frames.size());
    

	}

}
