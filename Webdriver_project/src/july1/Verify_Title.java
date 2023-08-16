package july1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) throws Throwable {
		//create instance object
		//System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com/");
		Thread.sleep(5000);
		String Expected ="google";
		String Actual = driver.getTitle();
		if(Expected.equalsIgnoreCase(Actual))
		{
			System.out.println("Title is matching::"+Expected+"         "+Actual);
		}
		else
		{
			System.out.println("Title is Not matching::"+Expected+"         "+Actual);
		}
		Thread.sleep(4000);
		driver.quit();


	}


}


