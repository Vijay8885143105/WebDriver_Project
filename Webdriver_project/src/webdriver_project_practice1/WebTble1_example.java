package webdriver_project_practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTble1_example {

	public static void main(String[] args) throws Throwable {
                  WebDriver driver=new FirefoxDriver();
                  driver.manage().window().maximize();
                  driver.manage().deleteAllCookies();
                  driver.get("https://cosmocode.io/automation-practice-webtable/");
                  Thread.sleep(2000);
                  WebElement table=driver.findElement(By.xpath("//table[@id='countries']"));
                  List<WebElement> rows=table.findElements(By.tagName("tr"));
                  System.out.println(rows.size());
                  for(int i=0;i<=rows.size();i++)
                  {
                	  List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
                	  System.out.println(columns.size());
                	  for(int j=0;j<=columns.size();j++)
                	  {
                		  String cell_Data=rows.get(j).getText();
                		  System.out.println(cell_Data);
                	  }
                  }
                  
	}

}
