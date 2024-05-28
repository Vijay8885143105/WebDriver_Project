package webdriver_Project_Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm_getText_Size_Links_Login {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/validateCredentials");
		Thread.sleep(4000);
		dr.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		dr.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebElement some_webelement_Name = dr.findElement(By.xpath("//b[normalize-space()='Performance']"));
		System.out.println("One of the WebPage element Name::::::::::"+some_webelement_Name.getText());
		List<WebElement>allhYper_Links=dr.findElements(By.tagName("a"));
		System.out.println("Number of Hyper Links are::::::::"+allhYper_Links.size());
		String expected="dashboard";
		String Actual=dr.getCurrentUrl();
		if (Actual.endsWith(expected)) {
			System.out.println("Login successefull");
		}
		else
		{
			System.out.println("Login Failure");
		}
		Actions ac = new Actions(dr);
		dr.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(4000);
		ac.moveToElement(dr.findElement(By.xpath("//a[normalize-space()='Logout']"))).click().perform();
		dr.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		dr.findElement(By.xpath("//input[@id='btnLogin']")).click();
        WebElement  checking= dr.findElement(By.xpath("//b[normalize-space()='My Info']"));
        System.out.println("Webelement Location:::::::::"+checking.getLocation());
        System.out.println("Webelement RunTimeValue::::::"+checking.getAttribute("value"));
        System.out.println("Webelement TagName::::::"+checking.getTagName());
        System.out.println("Webelement Size::::::"+checking.getSize());
		System.out.println("Number of Hyper Links are::::::");
		List<WebElement>allhYper_Links1=dr.findElements(By.tagName("a"));
		for (WebElement each : allhYper_Links1) {
			System.out.println(each.getText());
		}
        dr.quit();
      
	}




	}











