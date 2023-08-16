package july17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollto_Certain_Pixel_Vertically {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location = 'https://amazon.in'");
		Thread.sleep(5000);
		//Scroll Vertically to Certain pixel
		js.executeScript("window.scrollBy(0,900)");
		driver.quit();
		
		

	}

}
