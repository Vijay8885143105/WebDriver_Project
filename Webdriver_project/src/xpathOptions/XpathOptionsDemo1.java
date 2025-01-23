package xpathOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOptionsDemo1 {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		//dr.get("https://www.facebook.com/");
		//dr.get("https://www.facebook.com/r.php");
		dr.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=6226839098527668972&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9184931&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		Thread.sleep(4000);
		//X-Path Options
		//or
		/*dr.findElement(By.xpath("//input[@name='email'or@class='Vijay ']")).sendKeys("Shruthi");
		//and
		dr.findElement(By.xpath("//input[@name='email'and@class='inputtext _55r1 _6luy']")).sendKeys("Mounika");
		//contains
		dr.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1 _6luy')])[1]")).sendKeys("Narmada");
		//starts-with
		dr.findElement(By.xpath("//input[starts-with(@name,'email')]")).sendKeys("MadunithaReddy");
		//Text
		String 	variable=dr.findElement(By.xpath("//a[text()='Facebook Lite']")).getText();
		System.out.println(variable);*/
		//Chained X-Path
		try {
			dr.findElement(By.xpath("//form[@id='nav-search-bar-form']//input[@id='nav-search-submit-button']")).click();

		} catch (Exception e) {
		}
		dr.close();
	}


}







