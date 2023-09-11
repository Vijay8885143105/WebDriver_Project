package july7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_Handles {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//get gmail window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click three links to open tabs
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all windows id
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		//Iterate all windows
		for (String each : allwins) {
			//parent id should not equal to each id
			if (!parent.equals(each)) {
				//switch to each child window
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
				
			}
		}
		//switch to parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("pranga2010");
		Thread.sleep(5000);
		driver.quit();
		
			
		}


	}

