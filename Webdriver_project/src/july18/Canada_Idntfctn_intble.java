package july18;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canada_Idntfctn_intble {
	public static void main(String[] args) throws Throwable {
		String Expected_country = "Canada";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.id("customers"));
		List<WebElement>rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("Number of rows are:::"+row);
		for (int i = 1; i < rows.size(); i++) 
		{
			cols = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++)  
			{
				String Actual_Data = cols.get(j).getText();
				Thread.sleep(5000);
				System.out.println("\n"+Actual_Data);
				if (Actual_Data.equalsIgnoreCase(Expected_country)) 
				{
					System.out.println("        "+"Found in::"+i+"       "+"at column"+"      "+(j+1));
				}
				
				}
				System.out.println();
				System.out.println("===========================================");
			}
			driver.quit();

		
}
	
}


