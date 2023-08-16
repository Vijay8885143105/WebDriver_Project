package july19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 {

	public static void main(String[] args) throws Throwable {
		String dob = "20-Dec-1987";
		String temp[]=dob.split("-");
		String dt=temp[0];
		String month=temp[1];
		String year=temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("dob")).click();
		Thread.sleep(5000);
		new  Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++)
		{
			cols = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				String celltext = cols.get(j).getText();
				if (celltext.equals(dt))
				{
					Thread.sleep(5000);
					cols.get(j).click();
				}
				
			}
			
		}
		

	}

}
