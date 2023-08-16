package july17;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_ToptoBottom_BottomtoTop_Vertically {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//Scroll Top to Bottom vertically
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//Scroll bottom to Top Vertically
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
