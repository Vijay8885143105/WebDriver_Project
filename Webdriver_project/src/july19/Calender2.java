package july19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) throws Throwable {
		String doj = "20/Dec/2030";
		String temp[] = doj.split("/");
		String dt = temp[0];
		String month = temp[1];
		String year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calyear.equals(year)) {
			//click next button
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(calyear);
			
			
		}
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equalsIgnoreCase(month)) {
			//click next button
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span)[2]")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println();
			
		}
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			cols = rows.get(i).findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if (eachcell.getText().equals(dt)) {
					eachcell.click();
					
				}
					
				}
				
			}
}
	
		
		
		
		
		

	}


