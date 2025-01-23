package webdriver_project_practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebook_Acnt {

	public static void main(String[] args) throws Throwable {
		// Creating facebook account
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Actions ac =new Actions(dr);
		ac.moveToElement(dr.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"))).click().perform();
		Thread.sleep(2000);
		dr.findElement(By.name("firstname")).sendKeys("Vijay");
		Thread.sleep(2000);
		dr.findElement(By.name("lastname")).sendKeys("sheri");
		Thread.sleep(2000);
		dr.findElement(By.name("reg_email__")).sendKeys("9014851193");
		Thread.sleep(2000);
		dr.findElement(By.name("reg_passwd__")).sendKeys("9704640016");
		Thread.sleep(2000);
		//store list box into select class
		Select List=new Select(dr.findElement(By.xpath("//select[@id='day']")));
		List.selectByIndex(10);
		Thread.sleep(2000);
		Select List1=new Select(dr.findElement(By.xpath("//select[@id='month']")));
		List1.selectByIndex(7);
		Thread.sleep(2000);
		Select List2=new Select(dr.findElement(By.xpath("(//select[@id='year'])[1]")));
		List2.selectByValue("1995");
		Thread.sleep(2000);
		WebElement RadioButton=dr.findElement(By.xpath("//label[normalize-space()='Male']"));
		RadioButton.click();
		dr.findElement(By.name("websubmit")).click();
		dr.quit();
		






	}

}
