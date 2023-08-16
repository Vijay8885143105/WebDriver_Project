package july18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_SpecificRowCell_Data {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//Print Specific Row cell data in a table
		String tabledata1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[1]")).getText();
		String tabledata2 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[2]")).getText();
        System.out.println(tabledata1+"      "+tabledata2);
        driver.quit();
	}

}
