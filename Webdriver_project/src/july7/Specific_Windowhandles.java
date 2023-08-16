package july7;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Specific_Windowhandles {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//get gmail window id 
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click three links to open new tabs
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();
        //store all window id into array collection
        ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
        //switch to google account help window
        driver.switchTo().window(brw.get(2));
        Thread.sleep(5000);
        //click link
        driver.findElement(By.linkText("Community")).click();
        Thread.sleep(5000);
        driver.close();
        Actions ac = new Actions(driver);
        //switch to privacy window
        driver.switchTo().window(brw.get(1));
        Thread.sleep(5000);
        ac.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Main menu']//*[name()='svg']"))).click().perform();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Overview")).click();
        Thread.sleep(5000);
        driver.quit();

	}

}
