package webdriver_Project_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Tittle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(3000);
		String Expected = "hgfgfg";
		String Actual   = driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual)) {
			System.out.println("Tittle is matchig:::::"+Expected+"        "+Actual);
		}
		else
		{
			System.out.println("Tittle is Not matchig:::::"+Expected+"      "+Actual);
            Thread.sleep(5000);
            driver.quit();
		}


	}

}
