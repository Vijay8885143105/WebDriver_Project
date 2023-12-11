package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calnenders {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);

		//Implicit Wait
		Actions ac = new Actions(driver);

		//from
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("JMKT");
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();

		//To
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("SEC");
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();

		//Calendar 

		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();

		String doj = "3/March/2024";
		String Date[]=doj.split("/");
		String day = "3";
		String month = Date[1];
		String year = Date[2];

		String calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
		while (!year.equals(calYear)) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();
			calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
		}

		String calMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
		while (!month.equalsIgnoreCase(calMonth)) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();
			calMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
		}

		try {
			WebElement calTable = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-10']"));
			List<WebElement> rows,cols;
			rows = calTable.findElements(By.tagName("tr"));
			for (WebElement eachrow : rows) {
				cols = eachrow.findElements(By.tagName("td"));
				for (WebElement celldata : cols) {
					if (celldata.getText().equals(day)) {
						celldata.click();
					}
				}
			}
		} catch (Throwable e) {
			// TODO: handle exception
		}

		Thread.sleep(2000);

		//all classes
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down']")).click();


		Thread.sleep(2000);
		for (int i = 0; i < 11; i++) {
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(300);
		}
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//checkBox
		driver.findElement(By.xpath("//label[normalize-space()='Train with Available Berth']")).click();
		Thread.sleep(2000);

		//search
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);

		driver.quit();

	}

}
