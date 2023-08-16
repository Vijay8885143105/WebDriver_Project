package july17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Title_Domainname_Length {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Launch url
		js.executeScript("window.location='https://tatacliq.com'");
		Thread.sleep(5000);
		//Print Title and Length of title
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//Print url and Length of url
		String strurl = js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		//Print Domain name and length of domain
		String strdomain = js.executeScript("return document.domain").toString();
		System.out.println(strdomain);
		System.out.println(strdomain.length());
		driver.quit();
		

	}

}
