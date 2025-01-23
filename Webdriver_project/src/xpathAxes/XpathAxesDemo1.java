package xpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		//Self
		String      Island= dr.findElement(By.xpath("//td[normalize-space()='Island Trading']/self::td")).getText();
		System.out.println(Island);//Island Trading

		//Parent
		String      Island1= dr.findElement(By.xpath("//td[normalize-space()='Island Trading']/parent::tr")).getText();
		System.out.println(Island1);//Island Trading Helen Bennett UK

		//Child
		List<WebElement> No_ofchilds=dr.findElements(By.xpath("//td[normalize-space()='Island Trading']/ancestor::div/child::div"));
		System.out.println("Number od child elements            "+No_ofchilds.size());   //24
		
    //ancestor
	 String	ancestor=dr.findElement(By.xpath("//td[normalize-space()='Island Trading']/parent::tr")).getText();
	 System.out.println(ancestor);



	}

}
